import java.util.Scanner;
public class sum  
{  
public static void main(String args[])  
{  
int x, y, sum;  
x=2;
y=5;
 
/*x = Integer.parseInt(System.getenv("a"));  

//y = Integer.parseInt(System.getenv("b"));  


Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        x = Integer.parseInt(System.getenv(sc.nextInt()));
        
        System.out.println("Enter Second Number: ");
        y = Integer.parseInt(System.getenv(sc.nextInt()));
        
        sc.close();

*/
sum = sum(x, y);  
System.out.println("The sum of two numbers x and y is: " + sum);  
}  
//method that calculates the sum  
public static int sum(int a, int b)  
{  
int sum = a + b;  
return sum;  
}   
}  
