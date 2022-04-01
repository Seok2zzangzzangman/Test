import java.util.Scanner;
public class test{
public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
 int number = scanner.nextInt();
 System.out.println("구현할 단수는? : " + number );
 for ( int i = 0 ; i <20 ; i ++){
 if ( i<number ) {
	 
	 System.out.println(number*(i+1));
 }

 }
 }

	 
	 
}
