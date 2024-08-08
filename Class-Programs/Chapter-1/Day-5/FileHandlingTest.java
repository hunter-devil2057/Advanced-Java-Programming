package chapter1;
//Importing Packages
import java.io.*;   //for file handling operation
import java.util.*;     //for input output operation 

public class FileHandlingTest
{
    public static void WriteMethod(){
        try{
           System.out.println("Enter Text: ");
//       Scanning/getting/receiving input from user
            Scanner scan=new Scanner(System.in);
            String text=scan.nextLine();
            
//            Creating/Writing a File
            File file=new File("E://csit.txt");
            
//            if file doesn't exists then, it creates a new file
            if(!file.exists())
                file.createNewFile();
            
//            creating writer as new object of class FileWriter 
                FileWriter writer=new FileWriter("E://csit.txt");
                        writer.write(text);
                        writer.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void ReadMethod(){
        try{
//            Creating new object reader of class FileReader
                FileReader reader=new FileReader("E://csit.txt");
                
//             Creating loop to read all the characters of a file                
                int i;
                while((i=reader.read())!=-1)
                {
                    System.out.print((char)i);
                }
                reader.close();

        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void RandomAccessWrite(){
        try{
//            Creating file object of a class RandomAccessFile 
            RandomAccessFile file=new RandomAccessFile("E://csit.txt", "rw");
//            (path, "rw") mode rw means=>read/write
            file.seek(40);      //defining position as 40
            file.write("Advanced Java Programming".getBytes());
            file.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void RandomAccessRead(){
        try{
//            Creating file object of a class RandomAccessFile 
            RandomAccessFile file=new RandomAccessFile("E://csit.txt", "r");
//            (path, "rw"), mode r=>read
            file.seek(40);      //defining position as 40
            byte[] bytes=new byte[100];     //creating array
            file.read(bytes);
            String text=new String(bytes);
            System.out.println(text);
            file.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] s){
//     ReadMethod();
//    WriteMethod();
//    ReadMethod();
//    RandomAccessWrite();
    RandomAccessRead();
    }
}