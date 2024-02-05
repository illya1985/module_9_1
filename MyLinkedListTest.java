package org.example;

import java.util.LinkedList;

public class MyLinkedListTest {

        public static void main(String args[]){

            MyLinkedList<Integer> al=new MyLinkedList<>();
            al.add(10);
            al.add(21);
            al.add(32);
            al.add(43);
            al.add(54);
            for (int i=0; i< al.getSize();i++){
                System.out.print(al.get(i)+" ");
            }
            System.out.println("");
            System.out.println("indeks  "+al.get(3));
            System.out.println("size = "+al.getSize());
            al.remove(1);
            System.out.print("removed ");
            for (int i=0; i< al.getSize();i++){
                System.out.print(al.get(i)+" ");
            }
            System.out.println("");
            al.clear();
            //System.out.println(al.getSize());

        }

}
