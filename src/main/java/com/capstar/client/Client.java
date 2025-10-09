package com.capstar.client;

public class Client {
    private String name;
    private String version;
    private String author;

    public Client(String name, String version, String author) {
        this.name = name;
        this.version = version;
        this.author = author;
    }

    public void start() {
        System.out.println("✅ " + name + " v" + version + " by " + author + " started successfully!");
        System.out.println("Initializing modules...");
        System.out.println("Loading commands...");
        System.out.println("Setting up GUI...");
        System.out.println("✨ Ready to use! Type .help for commands.");
    }
}
