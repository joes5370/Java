import java.util.Scanner;

public class Beginnerjavacode1 {
public static void main(String[] args) {
	char a = 'A';
	char b = 'B';
	char c = '\t';
	System.out.println(a);
	System.out.print('\t');
	System.out.println(b);
	
	System.out.println("화면에 숫자를 입력해 주세요");
	Scanner s = new Scanner(System.in);
	int 입력값 = s.nextInt();
	System.out.print("입력할 숫자는:");
	System.out.print(입력값);
	
	}
}
