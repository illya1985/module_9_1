package org.example;

public class MyQueueTest {
    public static void main(String args[]){

        MyQueue<Integer> queue=new MyQueue<>();
        queue.add(10);
        queue.add(21);
        queue.add(32);
        queue.add(43);
        queue.add(54);

        for (int i=0; i< queue.getSize();i++){
            System.out.print(queue.get(i)+" ");
        }
        System.out.println("");

        System.out.println("size= "+queue.getSize());

        System.out.println("first = "+queue.peek());
        System.out.println("removed"+queue.poll());
        for (int i=0; i< queue.getSize();i++){
            System.out.print(queue.get(i)+" ");
        }
        queue.clear();
       // System.out.println("size= "+queue.getSize());

}
}
