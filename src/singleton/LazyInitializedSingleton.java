/*
 * LazyInitializedSingleton.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton INSTANCE;

    private LazyInitializedSingleton() { /* */ }

    public static LazyInitializedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitializedSingleton();
        }

        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
