/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class queue {
    public static void main(String args[]){
        Scanner val=new Scanner(System.in);
        MyQueue q=new MyQueue(10);
        char ch;
        System.out.println("STATIC QUEUE SIZE:10\n");
        do
        {
        System.out.println("1.PRESS '1'--INSERTING ELEMENT INTO QUEUE\n2.PRESS '2'--DELETING ELEMENT FROM QUEUE\n3.PRESS '3'--DISPLAYING QUEUE\nENTER YOUR CHOICE:");
        int option=val.nextInt();
        switch(option)
        {
        case 1:
            
             System.out.println("Enter element to be inserted:");
             int ele=val.nextInt();
             q.enqueue(ele);
             q.display();
             break;
        case 2:
             q.dequeue();
             q.display();
             break;
        case 3:
             q.display();
             break;
        default:
             System.out.println("INVALID OPTION!!\nENTER VALID OPTIONS FROM 1 TO 3 !!");
             break;
        }
        System.out.println("\nDO YOU WANNA CONTINUE??\n(Y/N)");
        ch=val.next().charAt(0);
        }while(ch=='y' || ch=='Y');



    }

    }
    

interface QueueOperations
{
void enqueue(int value);
void dequeue();
void display();
}
class MyQueue implements QueueOperations
{
int queue[],MAX;
int front=-1,rear=-1;
MyQueue(int m)
    {
       MAX=m;
       queue=new int[MAX];
    }

public void enqueue(int value)
    {
     if(rear==MAX-1)
     System.out.println("Queue is full.Can,t insert!!!");
     else
        {
     if(front==-1 && rear==-1)
     front++;
     rear++;
     queue[rear]=value;
        }
    }
public void dequeue()
    {
    if(front==-1 && rear==-1)
    System.out.println("Queue is empty.Nothing to delete!!!");
    else
        {
    if(front==rear)
    {
     System.out.println("Data deleted: "+queue[front]);
     front=rear=-1;
           }
     else
    {
     System.out.println("Data deleted: "+queue[front]);
     front++;
           }
        }
    }
public void display()
    {

    if(front==-1 && rear==-1)
        System.out.println("Queue is empty.Nothing to display!!!");
     else
    {
      System.out.println("QUEUE:");
      for(int i=front;i<=rear;i++)
      System.out.print(""+queue[i]+" ");
    }System.out.println("\n=====================");
    }


}
