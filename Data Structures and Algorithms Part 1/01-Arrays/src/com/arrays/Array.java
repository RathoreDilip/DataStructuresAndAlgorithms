package com.arrays;

public class Array {
    private int [] items;
    private int count;
    public Array(int length){
        items=new int[length];
    }

    public void insert(int item){
        // if the array is full, resize it
        // Add the new item at the end
        if(items.length==count){
            int newItems[]=new int[count * 2];

            // copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i]=items[i];
            }

            // set "items" to this new array
            items=newItems;
        }

        items[count++]=item;
    }

    public void removeAt(int index){
        // validate the index
        if(index < 0 || index>=count)
            throw new IllegalArgumentException();

        // shift the items to the left to fill the hole
        // [10,20,30,40]
        // index 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++) {
          //  if(i>=index){
                items[i]=items[i+1];
          //  }

        }
        count--;
    }

    public int indexOf(int item){

        for (int i = 0; i < count; i++)
             if(items[i]==item)
                return i;

        return -1;
    }


    public void print(){
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]+" ");
        }
    }

    public int max(){
        int max=0;
        for (int i = 0; i < count; i++) {
            if(items[i]>max)
                max=items[i];
        }
        return max;
    }

    public void insertAt(int item,int index){
        count++;
        if(index<0 || index>count)
            throw new IllegalArgumentException();

        // if insert element in last
        if(count-1==index){
            items[index]=item;
        }else{
            int temp=items[index];
            for (int i = count-1; i >= index; i--) {
                items[i]=items[i-1];
            }
            items[index]=item;
        }


    }

}
