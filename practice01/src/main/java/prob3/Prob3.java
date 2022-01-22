package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		/* 코드 작성 */
		int num = scanner.nextInt();
		int result =0;
		if(num%2==0) {//0이면 짝수 
			for(int i =0;i<=num;i=i+2) {
				result = i+result;
				
			}
					//7이랑 9면 25 7은 16 11은 36
		}
		else if(num%2==1) {//홀수
			for(int i =1;i<=num;i=i+2) {
				result = i+result;
				
			}
		}
		else if(num==1) {
			System.out.println(1);
		}
		else {
			System.out.println("error");
		}
		System.out.println(result);
		scanner.close();
	}
}
