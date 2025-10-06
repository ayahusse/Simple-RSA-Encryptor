/**
 * Created on: 9/3/2022
 * 
 * ULID: ahusse1
 * Class: IT 168
 */
package edu.ilstu;

import java.util.Random;
import java.util.Scanner;

/**
 * A simple program aiming to encrypt the user's input.
 * 
 * @author Ala'a Hussein
 *
 */
public class RSAEncryptor {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Random num = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the RSA Encryptor!");

		System.out.print("\n" + "Enter name: ");
		String userName = input.nextLine();

		// finding the user input's length
		int length = userName.length();

		// generating a random number between 100-500
		int rand = 100 + num.nextInt(400);

		// finding the middle of the string
		char middle = userName.charAt((userName.length() - 1) / 2);

		System.out.print("Hello " + userName + ", enter a message to encrypt: ");
		int message = input.nextInt();

		System.out.println("\n" + "Provide a public key (e,n) to encrypt this message.");

		System.out.print("Enter e: ");
		int keyE = input.nextInt();
		System.out.print("Enter n: ");
		int keyN = input.nextInt();

		input.close();

		// calculating user input for name encryption
		int cipher = (int) (Math.pow(message, keyE) % keyN);

		System.out.println("******************");
		System.out.println("Encryption Summary");
		System.out.println("******************");

		System.out.println(
				"Query ID: " + length + userName.charAt(userName.length() - 1) + userName.charAt(0) + rand + middle);

		System.out.println("Message (M): " + message);
		System.out.println("Public Key (e,n): " + "(" + keyE + ", " + keyN + ")");
		System.out.println("Ciphertext (C): " + cipher);

	}

}
