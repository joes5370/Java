import java.util.Scanner;

public class Nextproblem {
	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		int number1 = scan2.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���");
		int number2 = scan2.nextInt();
		
		int sumnumber = number1 + number2;
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.", number1, number2, sumnumber);
	}
}