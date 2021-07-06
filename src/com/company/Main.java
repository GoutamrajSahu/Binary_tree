package com.company;

import java.util.Scanner;

class node{
    node left,right;
    int data;
//    public node(){ }
    public node(int data){
        this.data = data;
    }

    public void insertNode(int value){
        if(value <= data){
            if(left == null){
                left = new node(value);
            }else{
                left.insertNode(value);
            }
        }else{
            if(right == null){
                right = new node(value);
            }else{
                right.insertNode(value);
            }
        }
    }

    public boolean isPresent(int value){
        if(data == value){
            return true;
        }else{
            if(value < data){
                if(left == null){
                    return false;
                }else{
                   return left.isPresent(value);
                }
            }else{
                if(right == null){
                    return false;
                }else{
                    return right.isPresent(value);
                }
            }
        }
    }

    public void inOrderPrint(){
        if(left != null){
            left.inOrderPrint();
        }
        System.out.println(data);
        if(right != null){
            right.inOrderPrint();
        }
    }

}

public class Main {
    public static void main(String[] args) {
        int value,root;
    Scanner sc = new Scanner(System.in);

    System.out.println("Input root node value");
    root = sc.nextInt();
    node a = new node(root);
    System.out.println("Input 1st number");
    value = sc.nextInt();
    a.insertNode(value);
    System.out.println("Input 2nd number");
    value = sc.nextInt();
    a.insertNode(value);
    System.out.println("Input 3rd number");
    value = sc.nextInt();
    a.insertNode(value);
    System.out.println("Input 4th number");
    value = sc.nextInt();
    a.insertNode(value);
    System.out.println("Input 5th number");
    value = sc.nextInt();
    a.insertNode(value);
    System.out.println("5 values inserted to binary tree...!");

    a.inOrderPrint();

    if(a.isPresent(7)==true)
        {
            System.out.println("7 is there.");
        }else{
            System.out.println("7 is not there.");
        }
    }

}