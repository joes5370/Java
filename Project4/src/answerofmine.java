import java.util.Scanner;

public class answerofmine {
	public static void main(String[] args) {
		System.out.println("ȭ�鿡 ���ڸ� �Է��� �ּ���!");
		Scanner s =new Scanner(System.in);
		int inputnumber = s.nextInt();
		System.out.print("�Է��� ���� +10��:");
		System.out.print(inputnumber+10);
		System.out.println();
		
		System.out.println("�� ���ڸ� �Է��� �ּ���!");
		int number2 = s.nextInt();
		System.out.print("�� ������ ����:");
		System.out.println(number2+inputnumber);
		
		System.out.print("�� ������ ����:");
		System.out.print(inputnumber*number2);
	}
}
