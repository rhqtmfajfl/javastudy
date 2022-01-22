package prob4;

public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		int length = str.length();
		char[] array = new char[length];
		for(int i = length-1; i >= 0; i--) {
			array[length-1-i] = str.charAt(i);
		}
		return array;
	}

	public static void printCharArray(char[] array){
		System.out.println( array );
	}

}
