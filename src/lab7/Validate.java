package lab7;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String name = getString(input, "Please enter a valid name: ");
		valName(name);

		String phone = getString(input, "Please enter a valid phone: ");
		valPhone(phone);

	 String email = getString(input,"Please enter a valid email: " );
	valEmail(email);

		String date = getString(input, "Please enter a valid date: ");
		valDate(date);

	}

	public static String getString(Scanner input, String prompt) {

		System.out.print(prompt);
		return input.nextLine();
	}

	public static String valName(String name) {
		Scanner input = new Scanner(System.in);

		boolean isValid = false;

		do {

			if (name.matches("[A-Za-z]{4,30}")) {
				System.out.println("The name you have entered is valid!");
				isValid = true;

			} else {
				System.out.println("Oh! As if!");
				isValid = false;
				name = getString(input, "Please enter a valid name: ");
			}

		} while (!isValid);

		return name;
	}

	public static String valPhone(String phone) {
		Scanner input = new Scanner(System.in);

		boolean isValid = false;

		do {

			if (phone.matches("\\(\\d{3}\\)\\d{3}-\\d{4}")) {
				System.out.println("The phone number enterd is valid!");
				isValid = true;

			} else {
				System.out.println("Do you understand the words that are comin' out of my mouth?");
				isValid = false;
				phone = getString(input, "Please enter a valid phone number: ");
			}

		} while (!isValid);

		return phone;
	}

	public static String valEmail(String email) {
		Scanner input = new Scanner(System.in);

		boolean isValid = false;

		do {

			if (email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.(?:[A-Z]{2,}|com|org))*$")) {
				System.out.println("Your email is Valid!");
				isValid = true;

			} else {
				System.out.println("You're Killin' Me, Smalls");
				isValid = false;
				email= getString(input, "Please enter a valid email: ");
			}

		} while (!isValid);

		return email;
	}

	public static String valDate(String date) {
		Scanner input = new Scanner(System.in);

		boolean isValid = false;

		do {

			if (date.matches("\\d{2}\\/\\d{2}\\/\\d{2}")) {
				System.out.println("The date enterd is valid!");
				isValid = true;

			} else {
				System.out.println("Ah, Houston, we've had a problem");
				isValid = false;
				date = getString(input, "Please enter a valid date: ");
			}

		} while (!isValid);

		return date;
	}
}
