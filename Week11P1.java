import java.util.HashMap;
import java.util.Scanner;

public class Week11P1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Character, Integer> romanNumeralMap = new HashMap<Character, Integer>();
		
		romanNumeralMap.put('I',1);
		romanNumeralMap.put('V',5);
		romanNumeralMap.put('X',10);
		romanNumeralMap.put('L',50);
		romanNumeralMap.put('C',100);
		romanNumeralMap.put('D',500);
		romanNumeralMap.put('M',1000);
		
		int num = 0;

		System.out.print("Enter a roman numeral between I-MMMCMXCIX: ");
		String romanNumeral = in.nextLine();
		//MMM
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i < romanNumeral.length() - 1 && romanNumeralMap.get(romanNumeral.charAt(i)) < romanNumeralMap.get(romanNumeral.charAt(i + 1))) {
                num -= romanNumeralMap.get(romanNumeral.charAt(i));
            } else {
                num += romanNumeralMap.get(romanNumeral.charAt(i));
            }
        }
        
        System.out.print(romanNumeral + " in decimal number is " + num);
        
        in.close();
		
	}

}
