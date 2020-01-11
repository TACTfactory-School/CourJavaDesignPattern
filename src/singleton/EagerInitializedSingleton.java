/*
 * EagerInitializedSingleton.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    private EagerInitializedSingleton() { /*  */ }

    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
