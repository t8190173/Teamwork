package project_spin;

import java.util.*;
import javax.activation.DataHandler;
import java.util.Date;
import project_spin.User;

public class Tester {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		testMail();
		
	}

	private static void testWho() {
		
	}

	private static void testUser() {
		Date date = new Date();
		System.out.println(date);
	}

	private static void testCc() {
		
	}

	private static void testMail() throws Exception {
		SendEmail email = new SendEmail("joannamoraiti1@gmail.com");
		email.firstContactMail();
	} 

	

}
