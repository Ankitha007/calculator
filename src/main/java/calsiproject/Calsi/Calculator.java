package calsiproject.Calsi;
import java.util.*;
public class Calculator {
	    public static void main(String[] args) 
	    {
	        int m, n, opt;
	       
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter first number:");
	        m = s.nextInt();
	        System.out.print("Enter second number:");
	        n = s.nextInt();
	        Calculator obj=new Calculator();
	        while(true)
	        {
	            System.out.println("Enter 1 for addition");
	            System.out.println("Enter 2 for subtraction");
	            System.out.println("Enter 3 for multiplication");
	            System.out.println("Enter 4 for division");
	            System.out.println("Enter 5 to Exit");
	            opt = s.nextInt();
	            switch(opt)
	            {
	                case 1:
	                	int sum=obj.add(m,n);
	                	System.out.println(sum);
	                break;
	 
	                case 2:
	                	int subans=obj.sub(m,n);
	                System.out.println("Result:"+subans);
	                break;
	 
	                case 3:
	                	int mulans=obj.mul(m,n);
	                System.out.println("Result:"+mulans);
	                
	                break;
	 
	                case 4:
	                	double divans=obj.div(m,n);
	                System.out.println("Result:"+divans);
	                	
	                	
	                break;    
	 
	                case 5:
	                System.exit(0);
	            }
	        }
	}
	
	
	int add(int m,int n)
	{
	int sum = m + n;
	return(sum);
	}
	int sub(int m,int n)
	{
int subans = m - n;
return(subans);
	}
	int mul(int m,int n)
	{
int mulans = m * n;
return(mulans);
	}
	double div(double m, double n)
	{
double divans = (double)m / n;
return(divans);
	}

}


