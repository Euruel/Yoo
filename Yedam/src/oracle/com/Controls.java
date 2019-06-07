package oracle.com;

public class Controls {

	public static void main(String[] args) {
	   int num = 1 ;
	   while (num <= 5 ) 
	   // while loop  
	   {
		   System.out.println("number is " + num);
		   num++;
	   }
	//do..............while
		
	   for (int i = 0; i < 10; i++) {
		   System.out.println(" i = " + i);
	   }

	   for (int j = 0; j < 5; j++) {
		System.out.println("i,  j => " + j + ", " + j + " \t") ;
	   }
	   while ( num <=5) {
	   num++;
	   int num2 = 1;
	   while (num2 <= 5) { 
		   System.out.println("i, j => " + num  + ", " + num2 + "\t");
           num2++;
	       }
	   }
	}

}
