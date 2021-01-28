package myArray;

import java.util.Objects;

public class myArray {
    private int[] data;
    private int size;
    private int reservedSize;


    public myArray(){
        this.size = 0;
        this.reservedSize = 10;
        this.data = new int[reservedSize];
    }

    public myArray(int reservedSize) {
        this.reservedSize = reservedSize;
        this.size = 0;
        this.data = new int[reservedSize];

    }
    public int size(){
        return size;
    }

    private void expend(){
        this.reservedSize += reservedSize / 2;
        int[] tmp = new int[reservedSize];
        for(int i = 1; i<size; i++){
            tmp[i] = this.data[i];
        }
        this.data = tmp;
    }
    public void add(int value){
        data[size] = value;
        size++;
        if(size+1 == this.reservedSize){
        expend();}
    }

    public void add(int index, int value){
        data[size] = value;
        size++;
        expend();
    }

    public int get(int index){
        return data[index];
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void delete(int index){
        int[] tmp = new int[reservedSize];
        this.size -= 1;
        for(int i = 0; i<size; i++) {
        if(index > i){
                tmp[i] = this.data[i];
            }
        else{
            tmp[i] = this.data[i+1];
            }
        }
        this.data = tmp;
    }

    public void show(){
        for(int i = 0; i< size; i++){
            System.out.println(data[i]);
        }
    }

    public void sort(int arg){
        boolean isMoved = false;
        if(arg == 0){
            for(int i = 0; i<size; i++){
             for(int j =0; j < size-1; j++){
                if(data[j] < data[j+1]){
                    int tmp = data[j+1];
                    data[j + 1] = data[j];
                    data[j] = tmp;
                    isMoved = true;
                }
             }
             if(isMoved){
                 break;
                }
            }
        }
    }



}
