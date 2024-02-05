package org.example;

import java.util.Stack;

public class MyStackTest {

    public static void main(String args[]){

        MyStack<Integer> stack=new MyStack<>();
        stack.push(10);
        stack.push(21);
        stack.push(32);
        stack.push(43);
        stack.push(54);

        for (int i= stack.getSize()-1; i>=0;i--){

            System.out.print(stack.get(i)+" ");
        }


        System.out.println("");

        System.out.println("size= "+stack.getSize());

        System.out.println("first = "+stack.peek());
        System.out.println("removed "+stack.pop());
        for (int i=stack.getSize()-1; i>=0;i--){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println("");

        stack.remove(2);
        for (int i=stack.getSize()-1; i>=0;i--){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println("");
        stack.clear();
        for (int i=stack.getSize()-1; i>=0;i--){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println("");





}
}
