import java.util.Random;
import java.util.Scanner;

public class Rockscissorpaper {
	public static void main(String[] args) {
		int gawiBawiBoCom;
		int gawiBawiBoUser;
		
		Random rand = new Random();
		gawiBawiBoCom = rand.nextInt(3);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가위바위보를 입력해 주세요.\n 가위는 0,바위는1,보는2입니다:");
		gawiBawiBoUser = scan.nextInt();

		System.out.println(gawiBawiBoCom);
		
		
		if (gawiBawiBoCom == gawiBawiBoUser) {
			System.out.print("비겼습니다.");
		}else if (gawiBawiBoCom == 0 && gawiBawiBoUser == 1) {
		    System.out.print("사용자가 이겼습니다.");
		}else if (gawiBawiBoCom == 0 && gawiBawiBoUser == 2) {
		    System.out.print("컴퓨터가 이겼습니다.");
		}else if (gawiBawiBoCom == 1 && gawiBawiBoUser == 0) {
		    System.out.print("컴퓨터가 이겼습니다.");
		}else if (gawiBawiBoCom == 1 && gawiBawiBoUser == 2) {
		    System.out.print("사용자가 이겼습니다.");
		}else if (gawiBawiBoCom == 2 && gawiBawiBoUser == 0) {
		    System.out.print("사용자가 이겼습니다.");
		}else if (gawiBawiBoCom == 2 && gawiBawiBoUser == 1) {
		    System.out.print("컴퓨터가 이겼습니다.");
		}
		 
}
}