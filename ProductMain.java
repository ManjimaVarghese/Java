import java.util.Scanner;
class product
{
 int pcode;
 String pname;
 int price;
 void insert(int c,String n,int price)
 {
   this.pcode=c;
   this.pname=n;
   this.price=price;
   
  }
 void display()
 {
  
  System.out.println(" product code is: "+this.pcode);
  System.out.println(" product name is: "+this.pname);
  System.out.println(" product price is: "+this.price);
 }
}
class ProductMain
{
 public static void main(String arg[])
 {
   product p1=new product();
   product p2=new product();
   product p3=new product();
   p1.insert(101,"Box",50);
   p2.insert(102,"pen",10);
   p3.insert(103,"book",40);
   p1.display();
   p2.display();
   p3.display();
   
 System.out.println("\nProduct having the lowest price\n");
    if((p1.price<p2.price)&&(p1.price<p3.price))
     {
      System.out.println("price:"+p1.price+", product:"+p1.pname);
      }
    else if((p2.price<p1.price)&&(p2.price<p3.price))
     {
         System.out.println("price:"+p2.price+", product:"+p2.pname);
     }
   else
    System.out.println("price:"+p3.price+", product:"+p3.pname);

 }
}
   