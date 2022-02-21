import java.util.*;
import java.io.*;

class Text
{
   public static void main(String args[])throws IOException
     {
       int a=1,b=0;           
       char ch;
       Scanner s =new Scanner(System.in);
       System.out.print("\nEnter File name: ");
       String str=s.nextLine();
       FileInputStream f=new FileInputStream(str);
       int n=f.available();
       for(int i=0;i<n;i++)
       {
           ch=(char)f.read();
           if(ch=='\n')
            a++;
           else if(ch==' ')
           b++;
                                                                       
        }
    System.out.println("\nNumber of lines : "+a);
    System.out.println("\nNumber of words : "+(a+b));
    System.out.println("\nNumber of characters : "+n);
                       

  }
}