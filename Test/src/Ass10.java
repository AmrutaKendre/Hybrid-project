
public class Ass10 {

	public static void main(String[] args) {
		
		int rows=7;  
		//Prints upper half pattern  
		for (int i = 2; i <= rows; i++)   
		{  
		//Prints i spaces at the beginning of each row  
		for (int j = 2; j < i; j++)   
		{  
		System.out.print(" ");  
		}  
		//Prints i to rows value at the end of each row  
		for (int j = i; j <= rows; j++)   
		{   
		System.out.print(j);   
		}   
		System.out.println();   
		}   
		//Prints lower half  pattern   
		for (int i = rows; i > 1; i--)   
		{  
		//Prints i spaces at the beginning of each row  
		for (int j = 2; j < i; j++)   
		{  
		System.out.print(" ");  
		}  
		//Prints i to rows value at the end of each row  
		for (int j = i; j <= rows; j++)  
		{  
		System.out.print(j);  
		}  
		System.out.println();  
		}  
		

	}

}
