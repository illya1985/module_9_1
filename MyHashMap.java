package org.example;

import java.util.*;

public class MyHashMap <K, V> {

    private static final int DEFAULT_SIZE = 8;
    private Entry<K, V> [] entries = new Entry[DEFAULT_SIZE];
    private int size;


    public void put(K key, V value) {
        int index = getBucketIndex(key);
        System.out.println(index);
       Entry<K, V> entry = new Entry<>(key, value);
        if (entries[index] == null) {
            entries[index] = entry;
            entries[index].setTail(entry);
        } else if(entries[index].equals(entry)) {
            entries[index].value= entry.value;
            size--;
        } else
        {
            var entryNode = entries[index];
                while (entryNode.getNext()!=null) {
                    var nextNode = entryNode.getNext();
                    if (nextNode.equals(entry)) {
                        nextNode.value = entry.value;
                        size--;
                        return;
                    }
                    entryNode = nextNode;
                } var lastEntry = entries[index].getTail();
            lastEntry.setNext(entry);
            entries[index].setTail(entry);
            }
        size++;
        }


    public V get(K key) {
        int index = getBucketIndex(key);
        if (entries[index] == null){
            System.out.print("key not found, value= ");
        }else
        if (entries[index].key.equals(key)) {
            return entries[index].value;
        } else {
            var entryNode = entries[index];
            while (entryNode.getNext()!=null) {
                var nextNode = entryNode.getNext();
                if (nextNode.key.equals(key)) {

                    return nextNode.value;
                }
                entryNode = nextNode;
            }
        }
System.out.print("key not found value= ");
        return null;
    }

    public void remove(K key){
        int index = getBucketIndex(key);
        if (entries[index] == null){
            System.out.print("key not found ");
        }else
        if (entries[index].key.equals(key)) {
            entries[index]=entries[index].next;
        } else {
            var entryNode = entries[index];
            while (entryNode.getNext()!=null) {
                var nextNode = entryNode.getNext();
                if (nextNode.key.equals(key)) {
                    entryNode.next=nextNode.next;
                }
                entryNode = nextNode;
            }
        }
    }
    public void clear(){
        System.out.println(entries.length);
        for (int i=0;i<entries.length;i++){
            entries[i]=null;
        }
    }


    public int size() {
        System.out.println(size+"-size");
        return size;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % entries.length);
    }


    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        Entry<K,V> tail;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;

        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        public Entry<K, V> getTail() {
            return tail;
        }

        public void setTail(Entry<K, V> tail) {
            this.tail = tail;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Entry<?, ?> entry)) return false;
            return Objects.equals(key, entry.key )&&(key.hashCode() == entry.key.hashCode());
        }



    }
}