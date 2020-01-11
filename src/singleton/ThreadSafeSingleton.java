/*
 * ThreadSafeSingleton.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton() { /* */ }

    public static synchronized ThreadSafeSingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ThreadSafeSingleton();
        }

        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
