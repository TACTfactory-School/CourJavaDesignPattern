/*
 * EnumSingleton.java, DesignPattern
 *
 * Copyright © 2019-2020 Mickael Gaillard / TACTfactory-School
 * License    : all rights reserved
 */

package singleton;

public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;

    private EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return this.info;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
