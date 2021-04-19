package com.designpattern.transmissions;

import com.designpattern.platforms.IPlatform;

public class AdvancedLive extends Live{
    public AdvancedLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na Transmissão");
    }

    public void comments(){
        System.out.println("Comentarios ativados na Transmissão");
    }

    public void emojis(){
        System.out.println("Emojis ativados na Transmissão");
    }
}
