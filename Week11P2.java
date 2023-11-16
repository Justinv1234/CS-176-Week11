import java.util.Scanner;

public class Week11P2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		String romanNumeral = "";

		System.out.print("Enter a number between 1-3999: ");
		int input = in.nextInt();
		int num = input;
		int count = 0;
        do {
            if (num / 1000 > 0) {
                num -= 1000;
                romanNumeral += "M";
            	count += 2;
            } else if (num / 900 > 0) {
            	num -= 900;
                romanNumeral += "CM";
            	count += 2;
            } else if (num / 500 > 0) {
                num -= 500;
                romanNumeral += "D";
            	count += 2;
            } else if (num / 400 > 0) {
                num -= 400;
                romanNumeral += "CD";
            	count += 2;
            } else if (num / 100 > 0) {
                num -= 100;
                romanNumeral += "C";
            	count += 2;
            } else if (num / 90 > 0) {
                num -= 90;
                romanNumeral += "XC";
            	count += 2;
            } else if (num / 50 > 0) {
                num -= 50;
                romanNumeral += "L";
            	count += 2;
            } else if (num / 40 > 0) {
                num -= 40;
                romanNumeral += "XL";
            	count += 2;
            } else if (num / 10 > 0) {
                num -= 10;
                romanNumeral += "X";
            	count += 2;
            } else if (num / 9 > 0) {
                num -= 9;
                romanNumeral += "IX";
            	count += 2;
            } else if (num / 5 > 0) {
                num -= 5;
                romanNumeral += "V";
            	count += 2;
            } else if (num / 4 > 0) {
                num -= 4;
                romanNumeral += "IV";
            	count += 2;
            } else if (num / 1 > 0) {
                num -= 1;
                romanNumeral += "I";
            	count += 2;
            }
        } while(num > 0);
        
        System.out.print(input + " in roman numeral is " + romanNumeral + " and the count is " + count);
       
        
        in.close();
		
	}

}
