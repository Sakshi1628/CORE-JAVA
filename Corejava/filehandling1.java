import java.io.*;
public class filehandling1
{
 public static void main(String args [])
 {
  File f1=new File("C:\\Users\\Sakshi Sadanandh\\OneDrive\\Documents\\Desktop\\introoooo");
  if(f1.mkdirs())
  {
   System.out.println("Folder Created");
  }
  else
  {
   System.out.println("Folder not created");
  }
  if(f1.exists())
  {
   System.out.println("Folder Exists");
  }
  else
  {
   System.out.println("Folder does not Exist");
  }
  if(f1.delete())
  {
   System.out.println("Folder Deleted");
  }
  else
  {
   System.out.println("Folder is not Deleted");
  }
 }
}

  
// cd Corejava
//javac filehandling1.java
//java filehandling

//op:Folder created
   //Folder exists
   //Folder deleted