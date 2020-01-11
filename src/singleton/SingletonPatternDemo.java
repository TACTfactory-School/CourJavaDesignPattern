/*
 * SingletonPatternDemo.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
//       final ThreadSafeSingleton object = new ThreadSafeSingleton();

        // Get the only object available
        final ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();

        // show the message
        singleton1.showMessage();

        final ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Same Object !!!");
        }
    }

}
