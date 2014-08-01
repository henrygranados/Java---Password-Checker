
import java.util.Scanner;

public class PasswordChecker {  

	//Main Function
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in); // Scanner library allows us insert input in our program.

		//Social security number
		String SocialSecurityNumber;
		//Password
		String password;
		boolean valid;
		String question = "Y";

		//User gets to choose N to stop
		while (question.equalsIgnoreCase("Y")) {

			//New user
			User temp = new User(); // temp is use as our object code
			//SSN validation
			do {
				valid = true;
				System.out.println("Enter your SSN as your Username : ");
				SocialSecurityNumber = in.nextLine();
				//User ID has format: "NNN-NN-NNNN" where N is digit from 0 to 9
				if (SocialSecurityNumber.length() != 11 || (
						SocialSecurityNumber.charAt(0) < '1' || SocialSecurityNumber.charAt(0) > '9'
						|| SocialSecurityNumber.charAt(1) < '1' || SocialSecurityNumber.charAt(1) > '9'
						|| SocialSecurityNumber.charAt(2) < '1' || SocialSecurityNumber.charAt(2) > '9'
						|| SocialSecurityNumber.charAt(4)< '1'  || SocialSecurityNumber.charAt(4) > '9'
						|| SocialSecurityNumber.charAt(5)< '1'  || SocialSecurityNumber.charAt(5) > '9'
						|| SocialSecurityNumber.charAt(7)< '1'  || SocialSecurityNumber.charAt(7) > '9'
						|| SocialSecurityNumber.charAt(8)< '1'  || SocialSecurityNumber.charAt(8) > '9'
						|| SocialSecurityNumber.charAt(9)< '1'  || SocialSecurityNumber.charAt(9) > '9'
						|| SocialSecurityNumber.charAt(10)< '1' || SocialSecurityNumber.charAt(10) > '9'
						|| SocialSecurityNumber.charAt(3) != '-' || SocialSecurityNumber.charAt(6) != '-')) {

					valid = false;
				}
			} while (!valid);
			do {
				valid = true;
				System.out.println("Enter password: ");
				password = in.nextLine();


				if (password.length() != 12) {
					valid = false;
				} else {
					// check space
					for (int i = 0; i < password.length(); i++) {
						if (password.charAt(i) == ' ') {
							valid = false;
							break;
						}
					}
					if (valid == true) {
						// fist letter is capitalized letter from "A" thru "Z",
						// last letter is a digit from "0" to "9"
						if (password.charAt(0) < 'A'
								|| password.charAt(0) > 'Z'
								|| !Character.isDigit(password.charAt(password
										.length() - 1))) {
							valid = false;
						}
					}
				}
			} while (!valid);

			//Setting the information for user
			temp.setFirstSSN(Float.parseFloat(SocialSecurityNumber.substring(0, 3)));
			temp.setSecondSSN(Float.parseFloat(SocialSecurityNumber.substring(4, 6)));
			temp.setThirdSSN(Float.parseFloat(SocialSecurityNumber.substring(7, 11)));
			//Setting the password
			temp.setPassword(password);

			System.out.printf("SSN = %.0f-%.0f-%.0f\n", temp.getFirstSSN(),temp.getSecondSSN(), temp.getThirdSSN());
			System.out.println("Password = " + temp.getPassword());

			System.out.print("Would you like to continue (y/n): ");
			question = in.nextLine();
		}
	}
}
