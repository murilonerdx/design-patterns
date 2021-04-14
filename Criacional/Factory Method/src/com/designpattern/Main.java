package com.designpattern;

public class Main {

    private static Transporte transporte;

    public static void main(String[] args) {
        configure(args[0]);
        if(transporte != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transporte.startTransporte();
    }

    private static void configure(String type) {
        switch (type){
            case "uber":
                transporte = new TransporteCarro();
                break;
            case "log":
                transporte = new TransporteMotocicleta();
                break;
            default:
                System.out.println("Selecione o tipo de entrega");
        }
    }
}
