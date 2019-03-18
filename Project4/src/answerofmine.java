import java.util.Scanner;

public class answerofmine {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해 주세요!");
		Scanner s =new Scanner(System.in);
		int inputnumber = s.nextInt();
		System.out.print("입력한 숫자 +10은:");
		System.out.print(inputnumber+10);
		System.out.println();
		
		System.out.println("또 숫자를 입력해 주세요!");
		int number2 = s.nextInt();
		System.out.print("두 숫자의 합은:");
		System.out.println(number2+inputnumber);
		
		System.out.print("두 숫자의 곱은:");
		System.out.print(inputnumber*number2);
	}
}
