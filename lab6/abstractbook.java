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
public class abstractbook {
    public static void main(String args[]){
        
        mybook obj[]=new mybook[3];
        int i;
        for(i=0;i<3;i++)
        {
            obj[i]=new mybook();
            obj[i].setdetails();
            System.out.println("title:"+obj[i].gettitle());
        }
        int sum=0;
        for(int j=0;j<3;j++)
        {
            sum=(int) (sum+obj[j].price);
        }
      
        System.out.println("total price of the three books:"+sum);
        
   
        
    }
    
}
abstract class book
{
   String title;
    String author;
    double price;
    Scanner obj=new Scanner(System.in);
   abstract void  setdetails();
   String gettitle()
   {
       return title;
   }             
}
class mybook extends book
{
    
  
    public void setdetails()
    {
        System.out.println("enter the title");
        title=obj.next();
        System.out.println("enter the author");
        author=obj.next();
        System.out.println("enter the price");
        price=obj.nextDouble();
        
    }

    
    
}

