package com.designpattern;

import com.designpattern.app.Application;
import com.designpattern.fabrica.ITransporteFabrica;
import com.designpattern.fabrica.NineNineTransporte;
import com.designpattern.fabrica.UberTransporte;

public class Main {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
	// write your code here
    }

    public static Application configureApplication(){
        Application app;
        ITransporteFabrica fabrica;

        String company = "uber";

        if(company == "uber"){
            fabrica = new UberTransporte();

        }else{
            fabrica = new NineNineTransporte();
        }
        return new Application(fabrica);
    }
}
