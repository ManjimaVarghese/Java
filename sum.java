import java.util.Scanner;
class sum
{
public static void main(String arg[])
 {
   int n,i;
   int sum=0;
 int a[]=new int[25];
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the no: of elements:");
   n=sc.nextInt();
  System.out.println("Enter the elements");
   for( i=0; i<n; i++){
         a[i] = sc.nextInt();
         sum = sum + a[i];
      }
   System.out.println("sum of  numbers is:" +sum);
  }
}
   