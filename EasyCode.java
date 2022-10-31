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
        int counter = 0;
        Scanner read = new Scanner(input);
        String blank ="";
        char endPunc = ' ';
        while(read.hasNext())
        {
            String temp = read.next();
            char[] chars = temp.toCharArray();
            for(int i = 0; i<chars.length; i+=2)
            {
                if(chars[i]=='?' || chars[i]=='!' || chars[i]=='.')
                {
                    endPunc=chars[i];
                }
                else
                blank+=chars[i];
            }
            for(int i = 1; i<chars.length; i+=2)
            {
                if(chars[i]=='?' || chars[i]=='!' || chars[i]=='.')
                {
                    endPunc=chars[i];
                }
                else
                blank+=chars[i];
            }
           if(read.hasNext())
           blank+=" ";

           if(!read.hasNext())
           blank+=endPunc;

           System.out.print(blank);
           blank="";
           if(!read.hasNext())
           {
            System.out.print("\n");
           }
        }
        ;
        
    }
    
}