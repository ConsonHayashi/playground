package me.dongqinglin.capability.define;

public class DynamicArray {

    public int[] datas = new int[DynamicArrayConst.LENGTH];
    public int index = 0;
    public int length = datas.length;

    public DynamicArray() {

    }

    public void put(int data) {
        this.resizable(this.index);
        this.datas[this.index] = data;
        this.index = this.index + 1;
    }

    public void put(int index, int data) {
        this.resizable(index);
        this.datas[index] = data;
        this.index = index + 1;
    }

    public int get(int index) {
        if(index < 0 || index >= this.length) {
            throw new IndexOutOfBoundsException("越界下标: " + index);
        }
        return datas[index];
    }

    private void resizable(int index) {
        if(index < 0 || index >= this.length) {
            int[] newArray = new int[length * 2];
            for (int i = 0; i < this.length; i++) {
                newArray[i] = this.datas[i];
            }
            this.datas = newArray;
            this.length = newArray.length;
        }
    }

    public String show() {
        String content = "[";
        for (int i = 0; i < this.index; i++) {
            content = content + this.datas[i] ;
            if(i != this.index - 1) {
                content = content + ", ";
            }
        }
        content = content + "]";
        return content;
    }

}

class DynamicArrayConst {
    public static final int LENGTH = 2;
}
