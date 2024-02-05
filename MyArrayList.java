package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Arrays;
    public class MyArrayList<T> {
        //implements Iterable<Iterator>
        public static final int DEFAULT_CAPACITY = 2;
        private T[] data;
        private int size;
        private T[] dataReSise;

        public MyArrayList() {
            this.data = (T[]) new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        public MyArrayList(int size) {
            this.data = (T[]) new Object[size];
            this.size = 0;
        }

        public void add(T input) {
            if (size >= data.length) {
                dataReSise=data;
               this.data=(T[]) new Object[size*2+1];
                int increaseSize = data.length/2+1;
                if (size > increaseSize) {
                    data = Arrays.copyOf(dataReSise, increaseSize + size);
                } else {
                    data = Arrays.copyOf(dataReSise, increaseSize);
                }
            }
            data[size] = input;
            size++;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return data[index];
        }

        public int getSize() {
            return size;
        }
        public T remove(int index) {
            if (index < 0 || index >= size) {
                throw new ArrayIndexOutOfBoundsException();

            }
            T[]dataRemove=data;
            this.data=(T[]) new Object[size-1];
            for (int i=0;i<index;i++){
                data[i]=dataRemove[i];
            }
            for (int j=index; j<data.length;j++){
                data[j]=dataRemove[j+1];
            }
            return (T) data;
        }
        public void clear() {

            for (int i=0; i <data.length; i++)
                data[i] = null;
            size=0;
            //return; //(T) (data=(T[]) new Object[DEFAULT_CAPACITY]);
        }


    }
