//练习1：JAVA单例

package com.young.singleton;

public class Singleton {
    private static Singleton instant;
    private Singleton() {}

    public static Singleton getInstant() {
        if (instant == null) {
            instant = new Singleton();
        }
        return instant;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstant();
        Singleton s2 = Singleton.getInstant();
        System.out.println(s1 == s2);
    }
}
