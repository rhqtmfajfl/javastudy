package prob5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int correctNumber = random.nextInt(100) + 1;
		int[] arr = { 1, 100 };
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		System.out.println(arr[0] + "-" + arr[1]);
		while (true) {

			/* 게임 작성 */
			int inputNum = scanner.nextInt();
			// 정답 램덤하게 만들기
			
			if (inputNum < correctNumber) {
				System.out.println("더 높게");
				arr[0] = inputNum;
				Arrays.sort(arr);
			} else if (inputNum > correctNumber) {
				System.out.println("더 낮게");
				arr[1] = inputNum;
				Arrays.sort(arr);
			}
			System.out.println(arr[0] + "-" + arr[1]);

			if (inputNum == correctNumber) {
				System.out.println("맞았습니다.");

				// 새 게임 여부 확인하기
				System.out.print("다시 하겠습니까(y/n)>>");
				String answer = scanner.next();
				if ("y".equals(answer) == false) {
					break;
				}
			}

		}

		scanner.close();
	}

}
