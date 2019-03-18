import java.util.Random;
import java.util.Scanner;

public class Dice_practice {
	public static void main(String[] args) {
		int rCom;
		
		Random rand = new Random();
		rCom = rand.nextInt(6) +1;
		
		
		System.out.println("주사위 게임을 시작하겠습니다");
		System.out.println(rCom);
	
		if (rCom == 1) {
			System.out.println("멍멍");
		}else if (rCom == 2){
			System.out.println("야옹");	
		}else if (rCom == 3) {
			System.out.println("3");
		}else if (rCom == 4) {
			System.out.println("4");
		}else if (rCom == 5) {
			System.out.println("5");
		}else if (rCom == 6) {
			System.out.println("6");
		}
		
	}
}


