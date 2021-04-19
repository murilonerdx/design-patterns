package com.designpattern;

import com.designpattern.platforms.IPlatform;
import com.designpattern.platforms.TwitchTV;
import com.designpattern.platforms.Youtube;
import com.designpattern.transmissions.AdvancedLive;
import com.designpattern.transmissions.Live;

public class Main {

    public static void main(String[] args) {
        startLive(new Youtube());
//        startLive(new TwitchTV());
    }

    public static void startLive(IPlatform platform){
        System.out.println("Iniciando a Transmissão... Aguarde");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
        System.out.println("Transmissão avançada");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
    }
}
