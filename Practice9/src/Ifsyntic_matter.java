
import java.util.Random;
import java.util.Scanner;


public class Ifsyntic_matter {
public static void main(String[] args) {
	
	int com;
	int user;
	
	Random rand = new Random();
	com = rand.nextInt(2);
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("가위바위보 게임을 시작하겠습니다. \n가위:0  바위:1  보:2");
	user = scan.nextInt();
	System.out.println(com);
	
	
	if (com == user) {
		System.out.println("비겼습니다.");
	}else if (com == 0 && user == 1) {
		System.out.println("당신이 이겼습니다.");
	}else if (com == 0 && user == 2 ) {
		System.out.println("컴퓨터가 이겼습니다.");
	}else if (com == 1 && user == 0) {
		System.out.println("컴퓨터가 이겼습니다.");
	}else if (com == 1 && user == 2) {
		System.out.println("당신이 이겼습니다.");
	}else if (com == 2 && user == 0) {
		System.out.println("당신이 이겼습니다.");
	}else if (com == 2 && user == 1) {
		System.out.println("컴퓨터가 이겼습니다.");
	}
		
}

	
}


