import java.io.*;
public class filehandling2
{
 public static void main(String args [])
 {
  File f1=new File("C:\\Users\\Sakshi Sadanandh\\OneDrive\\Documents\\Desktop\\jsp.txt");
  try
  {
   if(f1.createNewFile())
   {
    System.out.println("File Created");
   }
   else
   {
    System.out.println("File not created");
   }
  }
  catch(IOException e)
  {
   e.printStackTrace();
  }
 }
}

//cd Corejava
//javac filehandling2.java
//java filehandling

//op:File created