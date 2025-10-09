package com.capstar.client;

public class Main {
    public static void main(String[] args) {
        System.out.println("⚡ CapStar Client Loading...");
        Client client = new Client("CapStar Client", "1.0.0", "minestargamer22");
        client.start();
    }
}
