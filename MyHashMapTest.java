package org.example;

public class MyHashMapTest {
    public static void main(String args[]) {
        MyHashMap<String, String> mapContainer = new MyHashMap<>();
        mapContainer.put("ab", "one");
        mapContainer.put("222", "two");
        mapContainer.put("12", "three");
        mapContainer.put("2", "four");
        mapContainer.put("222bb", "five");


        System.out.println(mapContainer.get("ab"));
        System.out.println(mapContainer.get("222"));
        System.out.println(mapContainer.get("12"));
        System.out.println(mapContainer.get("2"));
        System.out.println(mapContainer.get("222bb"));

        mapContainer.size();

        mapContainer.remove("12");
        System.out.println(mapContainer.get("ab"));
        System.out.println(mapContainer.get("222"));
        System.out.println(mapContainer.get("12"));
        System.out.println(mapContainer.get("2"));
        System.out.println(mapContainer.get("222bb"));
        mapContainer.clear();
        System.out.println("cleared");
        System.out.println(mapContainer.get("ab"));
        System.out.println(mapContainer.get("222"));
        System.out.println(mapContainer.get("12"));
        System.out.println(mapContainer.get("2"));
        System.out.println(mapContainer.get("222bb"));



    }
}
