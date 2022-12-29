
import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter your string");
        String input=x.next();
        String [] cyktemp=new String[input.length()];
        for(int i=0;i<input.length();i++)
        {
        	cyktemp[i]=input.substring(i, i+1);
        }
        CYK cyk=new CYK(cyktemp);     
	}

}
