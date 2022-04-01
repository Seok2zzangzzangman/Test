import java.util.Scanner; // 입력값 받아오기	
public class test{
public static void main(String[]args) {
Scanner scanner = new Scanner(System.in); //입력값 받아오기 
 int number = scanner.nextInt(); // 입력값 형식? 정해주
 System.out.println("구현할 단수는? : " + number );
 for ( int i = 0 ; i <20 ; i ++){
 if ( i<number ) {
	 
	 System.out.println(number*(i+1));
 }

 }
 }

	 
	 
}
