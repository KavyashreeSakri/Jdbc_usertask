package jdbc_maven_user_task;

import java.sql.SQLException;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		User user = new User();
		UserCRUD userCrud = new UserCRUD();
		boolean flag1 = true;

		do {
			System.out.println("");
			System.out.println("Press 1. To Signup");
			System.out.println("Press 2. To Login");
			System.out.println("Press 3. Exit");
			System.out.print("Enter the choice : ");
			int choice = scanner.nextInt();
			System.out.println();
			switch (choice) {
			case 1: {
				System.out.print("Enter the userid : ");
				int userid = scanner.nextInt();
				System.out.print("Enter the username : ");
				String username = scanner.next();
				System.out.print("Enter the email id : ");
				String email = scanner.next();
				System.out.print("Enter the password : ");
				String password = scanner.next();
				System.out.print("Enter the address : ");
				String address = scanner.next();

				user.setUserid(userid);
				user.setUsername(username);
				user.setEmail(email);
				user.setPassword(password);
				user.setAddress(address);

				userCrud.signUp(user);

			}
				break;

			case 2: {
				System.out.println("Enter your email : ");
				String email = scanner.next();
				System.out.println("Enter the password : ");
				String password = scanner.next();
				user.setEmail(email);
				user.setPassword(password);

				boolean result = userCrud.loginUser(user);
				if (result == true) {
					boolean flag = true;
					System.out.println("Loggedin successfully...!!");
					do {
						System.out.println("Press 1. To enter facebook password ");
						System.out.println("Press 2. To enter instagram password ");
						System.out.println("Press 3. To enter snapchat password ");
						System.out.println("Press 4. To enter whatsapp password ");
						System.out.println("Press 5. To enter twitter pssword ");
						System.out.println("Press 6. Exit");
						System.out.println("Enter your choice : ");
						int choice1 = scanner.nextInt();
						System.out.println();
						switch (choice1) {
						case 1: {
							System.out.print("Enter facebook password : ");
							String fbPassword = scanner.next();
							String OldPswd = userCrud.fetchFacebook(email);
							if (OldPswd == null) {
								userCrud.facebook(email, fbPassword);
								System.out.println("Password inserted successfully...!!");
							} else {
								System.out.println("Password already exists...");
								System.out.println("Existing facebook password is : " + OldPswd);
								System.out.println("Press 1. To reset facebook password");
								System.out.println("Press 2: To exit ");
								int choicenew = scanner.nextInt();
								switch (choicenew) {
								case 1: {
									userCrud.facebook(email, fbPassword);
									System.out.println("Facebook password updated successfully...!!");
									System.out.println("Your new password is : " + fbPassword);
								}
									break;
								case 2: {
									System.out.println("Thank you...");
								}
									break;
								}
							}
						}
							break;
						case 2: {
							System.out.print("Enter Instagram password : ");
							String instaPassword = scanner.next();
							String OldPswd = userCrud.fetchInsta(email);
							if (OldPswd == null) {
								userCrud.instagram(email, instaPassword);
								System.out.println("Password saved successfully...!!");
							} else {
								System.out.println("Password already exists...");
								System.out.println("Your instagram password is : " + OldPswd);
								System.out.println("Press 1. To reset instagram password");
								System.out.println("Press 2: To exit ");
								int choicenew = scanner.nextInt();
								switch (choicenew) {
								case 1: {
									userCrud.instagram(email, instaPassword);
									System.out.println("Instagram password updated successfully...!!");
									System.out.println("Your new password is : " + instaPassword);
								}
									break;
								case 2: {
									System.out.println("Thank you...");
								}
									break;
								}
							}
						}
							break;
						case 3: {
							System.out.print("Enter snapchat password : ");
							String snapPassword = scanner.next();
							String OldPswd = userCrud.fetchSnap(email);
							if (OldPswd == null) {
								userCrud.snapchat(email, snapPassword);
								System.out.println("Password saved successfully...!!");
							} else {
								System.out.println("Password already exists...");
								System.out.println("Your snapchat password is : " + OldPswd);
								System.out.println("Press 1. To reset snapchat password");
								System.out.println("Press 2: To exit ");
								int choicenew = scanner.nextInt();
								switch (choicenew) {
								case 1: {
									userCrud.snapchat(email, snapPassword);
									System.out.println("Snapchat password updated successfully...!!");
									System.out.println("Your new password is : " + snapPassword);
								}
									break;
								case 2: {
									System.out.println("Thank you...");
								}
									break;
								}
							}
						}
							break;
						case 4: {
							System.out.print("Enter whatsapp password : ");
							String whatsappPassword = scanner.next();
							String OldPswd = userCrud.fetchWhatsapp(email);
							if (OldPswd == null) {
								userCrud.whatsapp(email, whatsappPassword);
								System.out.println("Password saved successfully...!!");
							} else {
								System.out.println("Password already exists...");
								System.out.println("Your whatsapp password is : " + OldPswd);
								System.out.println("Press 1. To reset twitter password");
								System.out.println("Press 2: To exit ");
								int choicenew = scanner.nextInt();
								switch (choicenew) {
								case 1: {
									userCrud.whatsapp(email, whatsappPassword);
									System.out.println("Whatsapp password updated successfully...!!");
									System.out.println("Your new password is : " + whatsappPassword);
								}
									break;
								case 2: {
									System.out.println("Thank you...");
								}
									break;
								}
							}
						}
							break;
						case 5: {
							System.out.println("Enter twitter password : ");
							String twitterPassword = scanner.next();
							String OldPswd = userCrud.fetchTwitter(email);
							if (OldPswd == null) {
								userCrud.twitter(email, twitterPassword);
								System.out.println("Password saved successfully...!!");
							} else {
								System.out.println("Password already exists...");
								System.out.println("Your twitter password is : " + OldPswd);
								System.out.println("Press 1. To reset twitter password");
								System.out.println("Press 2: To exit ");
								int choicenew = scanner.nextInt();
								switch (choicenew) {
								case 1: {
									userCrud.twitter(email, twitterPassword);
									System.out.println("Twitter password updated successfully...!!");
									System.out.println("Your new password is : " + twitterPassword);
								}
									break;
								case 2: {
									System.out.println("Thank you...");
								}
									break;
								}
							}
						}
						case 6: {
							flag = false;
						}
						}
					} while (flag);
				} else {
					System.out.println("Incorrect password...!!");
				}

			}
				break;

			case 3: {
				flag1 = false;
				System.out.println("Thank you...");

			}

			}
		} while (flag1);
	}
}