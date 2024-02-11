package org.example;

public class SingletonWithoutThreadSafe {
    private String name;
    private static SingletonWithoutThreadSafe instance;

    private SingletonWithoutThreadSafe(String name) {
        this.name = name;
    }

    public static SingletonWithoutThreadSafe getInstance(String name){
        if(instance == null){
            instance = new SingletonWithoutThreadSafe(name);
        }
        return instance;
    }
}
