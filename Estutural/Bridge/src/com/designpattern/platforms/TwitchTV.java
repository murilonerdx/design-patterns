package com.designpattern.platforms;

public class TwitchTV implements IPlatform{

    public TwitchTV(){
        configureRMTP();
        System.out.println("Twitch: Transmissão iniciada");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Twitch: Conta autorizado");
    }

    @Override
    public void authToken() {
        System.out.println("Twitch: Token autorizado");
    }
}
