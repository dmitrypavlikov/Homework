package myArray;

import java.util.Objects;

public class myArray {
    private int[] data;
    private int size;
    private int reservedSize;
    private boolean isEmpty;
    private boolean contain;

    public myArray(){
        this.size = 0;
        this.reservedSize = 10;
        this.data = new int[reservedSize];
        this.isEmpty = true;
        this.contain = false;
    }

    public myArray(int reservedSize) {
        this.reservedSize = reservedSize;
        this.size = 0;
        this.data = new int[reservedSize];
        this.isEmpty = true;
        this.contain = false;

    }

    public void add(int value){
        data[size] = value;
        size++;
        isEmpty = false;
    }

    public void add(int index, int value){
        data[size] = value;
        size++;
        isEmpty = false;
    }

    public int get(int index){
        return data[index];
    }

    public boolean isEmpty(){
        return isEmpty;
    }

    public boolean contains(int x){
        contain = false;
        for(int i = 0; i < size;i++){
            contain = (data[i] == x ? true : false);

        }
        return contain;
    }

}
