package org.example;

public class SingletonWithThreadSafe {
    private String name;

    private static volatile SingletonWithThreadSafe instance;

    private SingletonWithThreadSafe(String name){
        this.name = name;
    }

    public static SingletonWithThreadSafe getInstance(String name){
        if(instance == null){
            synchronized (SingletonWithThreadSafe.class){
                if(instance == null){
                    instance = new SingletonWithThreadSafe(name);
                }
            }
        }
        return instance;
    }
}
