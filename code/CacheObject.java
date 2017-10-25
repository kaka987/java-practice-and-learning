// 练习2：使用一个数组来缓存实例的不可变类

package com.young.cache;

public class CacheObject {
    private static int MAX_SIZE = 3;
    private static CacheObject[] cache = new CacheObject[MAX_SIZE];
    private static int pos = 0;
    private final String name;

    private CacheObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CacheObject valueOf(String name) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (cache[i] != null && cache[i].getName().equals(name)) {
                System.out.println("Get cache : " + i);
                return cache[i];
            }
        }

        if (pos == MAX_SIZE) {
            System.out.println("cache full : " + pos);
            pos = 0;
        }
        System.out.println("Set obj in cache");
        cache[pos++] = new CacheObject(name);
        return cache[pos - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == CacheObject.class) {
            CacheObject co = (CacheObject) obj;
            return name.equals(co.getName());
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode();
    }
}


public class CacheObjectTest {
    public static void main(String[] args) {
        CacheObject c1 = CacheObject.valueOf("hello java");
        CacheObject c2 = CacheObject.valueOf("hello java");
        CacheObject c3 = CacheObject.valueOf("hello php");
        CacheObject c33 = CacheObject.valueOf("hello php");
        CacheObject c4 = CacheObject.valueOf("hello go");
        CacheObject c44 = CacheObject.valueOf("hello go");
        CacheObject c5 = CacheObject.valueOf("hello c");
        CacheObject c55 = CacheObject.valueOf("hello c");
        CacheObject c6 = CacheObject.valueOf("hello python");
        CacheObject c66 = CacheObject.valueOf("hello python");
        CacheObject c7 = CacheObject.valueOf("hello bash");
        CacheObject c77 = CacheObject.valueOf("hello bash");
        System.out.println(c1 == c2);
    }
}
