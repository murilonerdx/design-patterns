package com.designpattern.transmissions;

import com.designpattern.platforms.IPlatform;

public class Live implements ITransmission{
    protected IPlatform platform;
    public Live(){

    }

    public Live(IPlatform platform){
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando Transmissão");
    }

    @Override
    public void result() {
        System.out.println("***** AO VIVO *****");
    }
}
