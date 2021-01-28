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
    public int size(){
        return size;
    }

    private void expend(){
        this.reservedSize += reservedSize / 2;
        int tmp[] = new int[reservedSize];
        for(int i = 1; i<size; i++){
            tmp[i] = this.data[i];
        }
        this.data = tmp;
    }
    public void add(int value){
        data[size] = value;
        size++;
        isEmpty = false;
        if(size+1 == this.reservedSize){
        expend();}
    }

    public void add(int index, int value){
        data[size] = value;
        size++;
        isEmpty = false;
        expend();
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

    public void delete(int index){

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
