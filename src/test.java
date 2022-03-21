import java.util.Scanner;
public class test {
public static void main (String[]args) {
	System.out.println("출력할 구구단 단수는?");	
	Scanner scanner = new Scanner (System.in);
	int number = scanner.nextInt(); 
	System.out.println("사용자가 입력한 값은 : " + number);
	if (number<2)  { System.out.println("2~9사이 숫자를 입력하시오");
	}else if  (number>9) { System.out.println("2~9사이 숫자를 입력하시오");
	}
	else for (int i = 1 ; i <10 ; i++ ) {
		System.out.println(number*i);
		
	}
	}
}
