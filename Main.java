package org.example;
import java.util.*;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Main {


         public static void main(String[] args) {
             MyArrayList<Integer> myArrayList = new MyArrayList();
             myArrayList.add(10);
             myArrayList.add(11);
             myArrayList.add(12);
             myArrayList.add(13);
             myArrayList.add(14);
             for (int i = 0; i < myArrayList.getSize(); i++) {
                 System.out.print(myArrayList.get(i) +",");
             }System.out.println();
             System.out.println("size="+myArrayList.getSize());

             System.out.println("element =" +myArrayList.get(2));
             myArrayList.remove(18);
             System.out.print("removed ");
             for (int i = 0; i < myArrayList.getSize()-1; i++) {
                 System.out.print(myArrayList.get(i) +",");
             }System.out.println();

                myArrayList.clear();
             for (int i = 0; i < myArrayList.getSize(); i++) {
                 System.out.print(myArrayList.get(i) +",");
             }System.out.println("cleared");


           // MyLinkedList<Integer> myLinkedList=new MyLinkedList<>();
         }
}