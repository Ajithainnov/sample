import io.*;
public class palin 
{
		public static void main(String[] args) 
    {
     String input="abcedefmadamstr";
     for(int i=0;i<input.length();i++)
     {
    	 for(int j=i+1;j<input.length();j++)
       {
    		 StringBuffer buffer=new StringBuffer(input.substring(i,j+1));
    		 if((buffer.reverse().toString()).equals(input.substring(i,j+1)))
         {
    			 System.out.println(input.substring(i,j+1));
    		 }
    	 }
     }
	}
  }
