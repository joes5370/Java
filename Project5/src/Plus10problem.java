import java.util.Scanner;

public class Plus10problem {
public static void main(String[] args) {
	System.out.println("���ڸ� �Է��� �ּ���");
	
	Scanner scan1 = new Scanner(System.in);
	int number1 = scan1.nextInt();
	
	int sumnumber = number1 +10;
	
	System.out.print("�Է¹��� ���ڴ�");
	System.out.print(number1);
	System.out.println("�Դϴ�.");
	System.out.printf("�Է¹��� ���� +10�� %d�Դϴ�.", sumnumber);
}
}
