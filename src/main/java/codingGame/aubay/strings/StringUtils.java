package codingGame.aubay.strings;

public class StringUtils {
	
	/**
     * Concatenates the given array of​​​​​​‌​​​​‌‌‌‌​‌​‌​​​‌​‌‌‌​​‌‌ strings.
     */
	static String concat(String[] strings) {
		String response = "";
		if ( strings != null ) {
			StringBuilder builder = new StringBuilder();
			for (String str: strings) {
				if ( str != null ) {
					builder = builder.append(str);
				}
			}
			response = builder.toString();
		}
		
		return response;
	}
	
}