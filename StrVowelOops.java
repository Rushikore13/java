package demo.ptpl;

public class StrVowelOops {
	
	public static void myMethod(String name) {
		int vowels=0;
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') 
				++vowels;
			
		}
		System.out.println("The Numer of Vowels:"+vowels);
		
	}
	public static void main(String[] args) {
		myMethod("rushi");

	}

}
