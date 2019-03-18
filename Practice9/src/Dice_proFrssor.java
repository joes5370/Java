
import java.util.Random;

public class Dice_proFrssor {
	public static void main(String[] args) {
		Random rand2 = new Random();

		System.out.println("주사위를 굴려주세요");
		int r1 = rand2.nextInt(6) + 1;
		System.out.println(r1);

//      r1 = r1 % 6;
//		r1 = r1 + 1;

		if (r1 == 1) {
			System.out.println("멍멍");
		} else if (r1 == 2) {
			System.out.println("야옹");
		} else {
			System.out.println(r1);
		}
	}
}

