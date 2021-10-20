package io.github.Dev_AkshDesai.PaswordStuff;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static io.github.Dev_AkshDesai.PaswordStuff.ReadPass.ReadPassword;
import static io.github.Dev_AkshDesai.PaswordStuff.WritePass.AddPassWord;

public class PasswordOperations {
	public static void PassFunc() throws FileNotFoundException {
		System.out.println("Enter 1 for new password");
		System.out.println("Enter 2 for viewing password");
		System.out.println("Enter 3 for editing password");

		Scanner in = new Scanner(System.in);

		int cv = in.nextInt();

		switch(cv) {
			case 1:     AddPassWord();    break;
			case 2:     ReadPassword();     break;
		}
	}
}