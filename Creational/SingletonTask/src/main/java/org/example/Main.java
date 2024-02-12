package org.example;

public class Main {
    public static void main(String[] args) {

        // Test SingletonWithoutThreadSafe
        Thread[] threadsًWithoutSafe = new Thread[10];
        for (int i=0; i<10; i++) {
            threadsًWithoutSafe[i] = new Thread(()->{
                SingletonWithoutThreadSafe singletonWithoutThreadSafe = SingletonWithoutThreadSafe.getInstance("Sameh");
                System.out.println("Thread " + Thread.currentThread().getId() + " - Instance: " + singletonWithoutThreadSafe);
            });
        }
        for (Thread thread : threadsًWithoutSafe){
            thread.start();
        }


        // Test SingletonWithThreadSafe
        Thread[] threadsWithSafe = new Thread[10];
        for (int i=0; i<10; i++){
            threadsWithSafe[i] = new Thread(()->{
                SingletonWithThreadSafe singletonWithThreadSafe = SingletonWithThreadSafe.getInstance("sameh");
                System.out.println("Thread " + Thread.currentThread().getId() + " - Instance: " + singletonWithThreadSafe);
            });
        }
        for (Thread thread : threadsWithSafe){
            thread.start();
        }

    }
}