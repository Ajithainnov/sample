import java.io.*;
import java.utils.*;
class revstring
{
    public static void main(String args[])
    {
    String str[] = "welcome".split(" ");
    String str1="";
        for(int i = str.length-1; i>= 0 ;i--)
        {
            str1 += str[i]+" ";
        }
        System.out.println(str1);
    }
}

