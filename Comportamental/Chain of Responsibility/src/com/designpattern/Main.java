package com.designpattern;

import com.designpattern.middlewares.CheckPermissionMiddleware;
import com.designpattern.middlewares.CheckUserMiddleware;
import com.designpattern.middlewares.Middleware;
import com.designpattern.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Server server;

    public static void init(){
        server = new Server();
        server.registerUsers("mu-silva@outlook.com","2z01i20qfmsmm");
        server.registerUsers("coelho-galactico@hotmail.com","123");
        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean done;
        do{
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite sua senha: ");
            String password = reader.readLine();
            done = server.logIn(email,password);
        }while(!done);
	// write your code here
    }
}
