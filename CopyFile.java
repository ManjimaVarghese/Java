import java.io.*;
class CopyFile
{
 public static void main(String args[])throws IOException, FileNotFoundException
  {
    int i;
     File f1=new File("D:\\javapgms\\myname.txt");
     File f2=new File("D:\\javapgms\\newone.txt");
     FileInputStream fin=new FileInputStream(f1);
     FileOutputStream fout=new FileOutputStream(f2);
     do
     {
      i=fin.read();
      if (i !=-1)
        fout.write(i);
     }while(i!=-1);
   System.out.println("The entire content of the myname file is copied into the file newone");
    fin.close();
     fout.close();
 }
}