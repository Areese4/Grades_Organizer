package lab1b;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Lab1b {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("Grades.txt"), "UTF-8");
        int first = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        while (in.hasNextInt()) {
            
            int i = in.nextInt();
            //System.out.println(i);
            
            
            if ((i >= 0) && (i <= 24) ) {
                a++;
            } 
            else if ((i >= 24) && (i <= 49)) {
                b++;
            } 
            else if ((i >= 50) && (i <= 74)) {
                c++;
            } 
            else if ((i >= 75) && (i <= 99)) {
                d++;
            } 
            else if ((i >= 100) && (i <= 124)) {
                e++;
            } 
            else if ((i >= 125) && (i <= 149)) {
                f++;
            } 
            else if ((i >= 150) && (i <= 174)) {
                g++;
            } 
            else if ((i >= 175) && (i <= 200)) {
                h++;
            }          
            
         }
            
            System.out.println("[0 - 24]: " + a);        
            System.out.println("[25 - 49]: " + b );                    
            System.out.println("[50 - 74]: " + c);
            System.out.println("[75 - 99]: " + d );        
            System.out.println("[100 - 124]: " + e);
            System.out.println("[125 - 149]: " + f);
            System.out.println("[150 - 174]: " + g);
            System.out.println("[175 - 200]: " + h );
            
            
           
        
    }


}

   