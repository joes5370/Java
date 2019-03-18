import java.util.Scanner;

public class Plus10problem {
public static void main(String[] args) {
	System.out.println("숫자를 입력해 주세요");
	
	Scanner scan1 = new Scanner(System.in);
	int number1 = scan1.nextInt();
	
	int sumnumber = number1 +10;
	
	System.out.print("입력받은 숫자는");
	System.out.print(number1);
	System.out.println("입니다.");
	System.out.printf("입력받은 숫자 +10은 %d입니다.", sumnumber);
}
}
