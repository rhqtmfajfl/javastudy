package prob1;

import java.util.Scanner;


public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		

		int temp = 0;
		
		for(int j=0; j<count/2+1; j++) {
			for(int i=0; i<count-1; i++) {
				if(array[i]<array[i+1]) {
					temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
				}
				count--;
			}
		}
		
		// 결과 출력
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}		
	}
}