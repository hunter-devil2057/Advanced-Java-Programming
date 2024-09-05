package FileHandle;
import java.util.*;
import java.io.*;
/*
    WAP to take input string from user and find vowels and consonants. 
        - Check and save vowel letter in Vowel.txt and consonant lettter in Consonant.txt
*/
public class FileHandle {
    public static void main(String[] args) throws Exception
    {
//        Reading Input from the user
        System.out.println("Enter a String: ");
        String str=new Scanner(System.in).nextLine().toLowerCase();     //in lowercase
        
        String vowel="", cons="";
        
        for(int i=0; i<str.length(); i++)
        {
            char c=str.charAt(i);           //reading character at every loop
//            if character is in vowel
            if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u'){vowel=vowel+c;}
            else{cons=cons+c;}
        }
        System.out.println(vowel);
        System.out.println(cons);
        File vf=new File("Vowel.txt");
        File cf=new File("Consonant.txt");
        if(!vf.exists())
            vf.createNewFile();
        if(!cf.exists())
            cf.createNewFile();
        
        FileWriter vW=new FileWriter("Vowel.txt");
        vW.write(vowel);
        vW.close();
        FileWriter cW=new FileWriter("Consonant.txt");
        cW.write(cons);
        cW.close();
    }
}
