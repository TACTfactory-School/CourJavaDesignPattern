/*
 * ThreadSafeDoubleCheckSingleton.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package singleton;

public class ThreadSafeDoubleCheckSingleton {

    private static ThreadSafeDoubleCheckSingleton INSTANCE;

    private ThreadSafeDoubleCheckSingleton() { /* */ }

    public static ThreadSafeDoubleCheckSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (ThreadSafeDoubleCheckSingleton.class) {
                if (INSTANCE == null){
                    INSTANCE = new ThreadSafeDoubleCheckSingleton();
                }
            }
        }

        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
