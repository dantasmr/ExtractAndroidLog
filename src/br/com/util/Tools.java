package br.com.util;

public class Tools {
	
	
	public static String extractAndroidLogLine(String line) {
		
		final String token = "/com.xx.xxxx";
		final String points = ":";
		
		if (line != null && line.contains(token)) {
		
		int position = line.indexOf(token);
		int size = line.length()-1;
		
		String substr = line.substring(position,size);
		int position_points = substr.indexOf(points)+1;
		size = substr.length()-1;
		
		String resu = substr.substring(position_points,size);
		return resu;
		
		}else {
			return line;
		}
		
	}
	
	

}
