package gui;

import java.util.Scanner;

public class PasswordRecovery {
	private String securityQuestion;
	private boolean answer;
	private String newPassword;

	private static Scanner input = new Scanner(System.in);

	public PasswordRecovery(String securityQuestion, boolean answer, String newPassword) {
		super();
		this.securityQuestion = securityQuestion;
		this.answer = answer;
		this.newPassword = newPassword;
	}

	public void askSecurityQuestion(String securityQuestion) {
		System.out.println(this.securityQuestion);

		if (answer) {
			System.out.println("Your answer to the security question is correct. Please enter your new password.");
			newPassword = input.nextLine();
		}
	}
}
