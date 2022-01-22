package prob4;

public class StringUtil {

	public static String concatenate(String[] str) {
		int length = str.length;
		String strArr = "";
		for(int i = 0; i < length; i++) {
			strArr += str[i];
		}
		return strArr;
	}

}
