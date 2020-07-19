//****************************************************************************************************************
// Kip Brower
// Programming Fundamentals - 50100-002
// Summer 2020
// Programming Assignment 1 - Cipher.java
//****************************************************************************************************************

import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {
	
	int user1, user2, user3, user4, user5, //Variables for the 5 user supplied numbers
		Total, //Variable for the plaintext value to be encoded 
		randomKey, //Variable for the random generated number for the encoding key 
		Total_1, Total_2, //Variables for arithmetic operations
		encodedNumber1, encodedNumber2; //Variables corresponding to tens and ones digits
	
	
	System.out.println("Welcome to the Cipher Program.");
	System.out.println("Please enter five digits between 0 to 19");
	Scanner userNumber = new Scanner(System.in);
	
	// - USER INPUT #1 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	System.out.println("1st number: " + (user1 = userNumber.nextInt()));
		if (user1 < 0); {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		if (user1 > 19) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
	
	// - USER INPUT #2 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	System.out.println("2nd number: " + (user2 = userNumber.nextInt()));
		if (user2 < 0) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		if (user2 > 19) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
	
	// - USER INPUT #3 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	System.out.println("3rd number: " + (user3 = userNumber.nextInt()));
		if (user3 < 0) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		if (user3 > 19) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
	
	// - USER INPUT #4 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	System.out.println("4th number: " + (user4 = userNumber.nextInt()));
		if (user4 < 0) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		if (user4 > 19) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
	
	// - USER INPUT #5 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	System.out.println("5th number: " + (user5 = userNumber.nextInt()));	
		if (user5 < 0) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		if (user5 > 19) {
		System.out.println("Please read directions and try again!");
		System.exit(0);}
	
	//Generates the plaintext number for the Modulo 10
	Total = user1 + user2 + user3 + user4 + user5;
	System.out.println("Total: " + Total);
	
	//Generates random key number for encoding
	Random key = new Random();
	System.out.println("Your random key is " + (randomKey = key.nextInt(10)));
	
	// MODULO 10 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	// Modulo 10 on plain text number comprising: 
	// conditional statements generating the encoded number,
	// in both cases of the total being < 10 or >= 10. 
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	
	if (Total < 10) {  // conditional statement giving the leading zero and encoded number if Total < 10.
		Total_1 = Total - Total;
		encodedNumber1 = (Total_1 + randomKey)%10; 
		encodedNumber2 = (Total + randomKey)%10;
	System.out.println("Your encoded number is " + encodedNumber1 + encodedNumber2);}
	
	if (Total >= 10) { //conditional statement giving the encoded number if Total >= 10.
		encodedNumber1 = ((Total / 10) + randomKey)%10; //Total / 10 gives tens digit
		Total_2 = (Total / 10) * 10;  //Gives access to ones place for encodednumber2
		encodedNumber2 = ((Total - Total_2) + randomKey)%10;
		// Checks to ensure that the right values of the individual encoded digits are being calculated
		// System.out.println("Encoded number 1: " + (Total / 10));
		// System.out.println("Total_2: " + Total_2);
		// System.out.println("Encoded number 2: " + (Total - Total_2));
		System.out.println("Your encoded number is " + encodedNumber1 + encodedNumber2);}
	

	userNumber.close();
	
	}

}
