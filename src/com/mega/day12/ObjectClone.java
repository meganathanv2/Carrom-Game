package com.mega.day12;

class children implements Cloneable{
    int data3;
    int data4;

    public children(int data3, int data4) {
        this.data3 = data3;
        this.data4 = data4;
    }

    public void display(){
        System.out.println(data3+" "+data4);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    
}
class Parent implements Cloneable{
    int data1;
   children data2;

    public Parent(int data1,children data2) {
        this.data1=data1;
        this.data2=data2;
    }

    public void display(){
        System.out.println(data1+" ");
         data2.display();
    }
   //shallo copy
   /*protected Object clone() throws CloneNotSupportedException{
    return super.clone();
   }*/

    //Deep Copy
  protected Object clone() throws CloneNotSupportedException{
    Parent s1=(Parent)super.clone();
    s1.data2=(children)data2.clone();
    return s1;
  }
    
}

public class ObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException{
        children s1=new children(23,34);
        Parent p1=new Parent(29, s1);
        p1.display();
        Parent p2=(Parent)p1.clone();
        p2.data2.data3=99;
        p1.display();
        p2.display();
    }
    
}
