import java.util.Scanner;
class symmetricMatrix
{
  public static void main(String arg[])
  {
   int b=0;
   int a[][] = new int[10][10];
   int temp[][] = new int[10][10];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of rows :");
  int r=sc.nextInt();
  System.out.println("enter the number of columns:");
  int c=sc.nextInt();
  System.out.println("enter the elements of matrix");
  for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
      a[i][j]=sc.nextInt();
     }
    }
   System.out.println("Elements in  the  matrix:");
  for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
      System.out.print(a[i][j]+" ");
     }
    System.out.println();
    }
 
  for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
      temp[j][i]=a[i][j];
     }
    }
    System.out.println("After interchanging the rows and colunms");
    for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
     System.out.print(temp[i][j]+" ");
     }
     System.out.println();
    }

    for(int i=0;i<r;i++)
   {
    for(int j=0;j<c;j++)
    {
      if(temp[i][j]!=a[i][j])
        b=1;
        break;
         
     }
    }
    if(b==1)
      System.out.println("It is a not symmetric matricx");
    else
        System.out.println("It is  a symmetric matricx");
    
  }
}