import java.util.*;
import java.io.*;
import java.lang.*;
public class EasyCode
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(new File("easycode.dat"));
        int num = in.nextInt();
        for(int i = 0; i<num; i++)
        {
            calculate(in.nextLine());
        }
    }

    public static void calculate(String input)
    {
        int counter = 0; //idk why i have this tbh
        Scanner read = new Scanner(input); //read the string
        String blank ="";
        char endPunc = ' ';
        while(read.hasNext()) //while theres another word 
        {
            String temp = read.next();
            char[] chars = temp.toCharArray();
            for(int i = 0; i<chars.length; i+=2) //iterates through every other
            {
                if(chars[i]=='?' || chars[i]=='!' || chars[i]=='.') //checks for end punc
                {
                    endPunc=chars[i];
                }
                else
                blank+=chars[i];
            }
            for(int i = 1; i<chars.length; i+=2) //iterates through the ones it didn't prior
            {
                if(chars[i]=='?' || chars[i]=='!' || chars[i]=='.') //also checks for end punc
                {
                    endPunc=chars[i];
                }
                else
                blank+=chars[i];
            }
           if(read.hasNext()) //if theres another word, adds a space
           blank+=" ";

           if(!read.hasNext()) //if theres no more words, adds the end punc
           blank+=endPunc;

           System.out.print(blank); 
           blank=""; //resets word
           if(!read.hasNext())
           {
            System.out.print("\n"); //if it is end of sentence, new line
           }
        }
        ;
        //HI THIS IS IN TEST
    }
    
}