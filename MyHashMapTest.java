package org.example;

public class MyHashMapTest {
    public static void main(String args[]) {
        MyHashMap<String, String> mapContainer = new MyHashMap<>();
        mapContainer.put("1", "one");
        mapContainer.put("1", "two");
        mapContainer.put("2", "three");
        mapContainer.put("2", "four");

        System.out.println(mapContainer.get("1"));
        System.out.println(mapContainer.get("2"));

//    put(Object key, Object value) додає пару ключ + значення
//    remove(Object key) видаляє пару за ключем
//    clear() очищає колекцію
//    size() повертає розмір колекції
//    get(Object key) повертає значення (Object value) за ключем


    }
}
