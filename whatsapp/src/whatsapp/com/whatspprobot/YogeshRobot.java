package whatsapp.com.whatspprobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class YogeshRobot {

	/**
	 * @author Yogesh_joga
	 * @email: yogeshjoga@protonmail.com
	 */
	
	
	//colors
	static String RED_BOLD = "\033[1;91m"; 
	static String GREEN_BOLD = "\033[1;92m";
	static String YELLOW_BOLD = "\033[1;93m";

	Scanner scanner = new Scanner(System.in);
	static int limit;
	int sec;
	// int start = 1;

	
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 * main banner taken from file.
	 * ASCII ART in my file, thats contain into my personal computer
	 */
	public void mainBannerYogesh() throws FileNotFoundException, InterruptedException {

		// here taken file from desktop
		File file = new File("D:\\eclipse_workspaces\\whatsapp\\src\\whatsapp\\com\\whatspprobot\\MyNameArtYogesh.txt");
		Scanner reader = new Scanner(file);

		// inside file content reading by like one by one char, like animation
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			System.out.println(RED_BOLD+line);
			Thread.sleep(100);
		}

		System.out.println("\n\n\n");
		// Thread sleep time 10 sec's
		Thread.sleep(1000);
	}

	/*
	 * this is updating and fixing errors 
	 */
	public void testing() throws InterruptedException {
		String message ="Sorry to say it's now working on please wait some\n time we will give update very soon...";
		for (int i = 0; i < message.length(); i++) {
			System.out.print(RED_BOLD + message.charAt(i));
			Thread.sleep(3);
		}
	}
	
	
	
	
	
	public void options() throws InterruptedException, AWTException, FileNotFoundException {

		YogeshRobot obj = new YogeshRobot();
		// this is the main banner to print logo's
		obj.mainBannerYogesh();
		// 1st BANNER TO PRINT EVERYTHING 
		obj.bannerYogesh();
		String bannerYogesh = "-------------------------------------------------------\n"
				+ "----------------- SELECT YOUR OPTION            -------\n"
				+ "----------------- ENTER 1 BOMBING YOUR FRIEND   -------\n"
				+ "----------------- ENTER 2 BOMBING YOUR CONTACTS -------\n"
				+ "----------------- ENTER 3 RETURN TO HOME        -------\n"
				+ "-------------------------------------------------------\n";

		for (int i = 0; i < bannerYogesh.length(); i++) {
			System.out.print(YELLOW_BOLD + bannerYogesh.charAt(i));
			Thread.sleep(3);
		}

		int input;
		System.out.println(GREEN_BOLD+"Enter your option : ");
		input = obj.scanner.nextInt();
    	switch (input) {
		   case 1: {
			   obj.whatsAppBomb();
			   break;
		     }
		   case 2:{
			   obj.testing();
			   break;
		   }
		   case 3:{
			  obj.options();
		   }
		}
	}
	
	
	
	
	
	/*
	 * Banner for intro of application and me 
	 * @Yogesh_joga_darling
	 * this is second version
	 */
	public void bannerYogesh() throws InterruptedException {
		String bannerYogesh = "-------------------------------------------------------\n"
				+ "-----------WEL COME TO WHATS APP FUCKER BOMB-----------\n"
				+ "---------------THIS WORKS ONLY IN COMPUTERS------------\n"
				+ "-----------------JUST GIVE SOME INPUTS-----------------\n"
				+ "--------------AND OPEN YOUR WHATS APP WEB--------------\n"
				+ "----------------IN YOUR DESKTOP OR LAPTOP--------------\n"
				+ "-------------------------------------------------------\n"
				+ "-----------------------@YOGESH JOGA--------------------\n"
				+ "------------IM THE JAVA EXPERT I LOVE CODING-----------\n"
				+ "-------------------------------------------------------\n"
				+ "This is educational purpose don't use illegal purpose  \n"
				+ "just enjoy the tools and make fun with your friends    \n"
				+ "*******************************************************\n"
				+ "****************Author @Yogesh Joga********************\n"
				+ "*******************************************************\n"
				+ "*******************************************************\n\n\n\n";

		for (int i = 0; i < bannerYogesh.length(); i++) {
			System.out.print(GREEN_BOLD+bannerYogesh.charAt(i));
			Thread.sleep(3);
		}

	}
	
	
	
	
	

	public void bannerYogesh2() throws InterruptedException {

		String bannerYogi = "*********************************************************\n"
				+ "*********************************************************\n"
				+ "*********** HOW MANY MSG'S YOU NEED TO SEND ? ***********\n"
				+ "******************YOUR FUCKING FRIEND********************\n"
				+ "**********************   AND   **************************\n"
				+ "**************** WHAT IS THE DELAY TIME *****************\n"
				+ "*********************GIVE DELAY TIME*********************\n"
				+ "****************** AS IN MILLI SECONDS ******************\n"
				+ "*********************************************************\n"
				+ "******************* @ version 1.0.0  ********************\n"
				+ "******************  Relese Date 08/03/2022  *************\n"
				+ "*********************************************************\n";

		for (int i = 0; i < bannerYogi.length(); i++) {
			System.out.print(GREEN_BOLD+bannerYogi.charAt(i));
			Thread.sleep(3);
		}

	}
	
	/*
	 * number of messages to send victim's chat box 
	 * you use what ever it may like web app's r
	 * standalone app's 
	 * ex: what's app, facebook, instagram, sanpchat.. etc
	 * 
	 * this app is based on robot 
	 * take input as msg and send to victim's chat box 
	 * 
	 */
	
	public void countMessages() {
		YogeshRobot obj = new YogeshRobot();
		
		
		
		System.out.println("How many msg's required to send your friend... ");
		System.out.println("Just take input..");
		System.out.println("\n 1) Below 100\n 2) Below 1000\n 3) Below 10000\n 4) Below 100000\n 5) Below 10lakhs\n 6) Below 1 Crore\n 7) Below 10 Crore\n 8) Manual given");
		
		System.out.print(RED_BOLD+"Enter your option here : ");
		// this is the main logic of the options to make easier to take inputs from user
		int input = obj.scanner.nextInt();
		int mess;
		
		switch (input) {
		case 1: {
			  System.out.println(YELLOW_BOLD+"Give number it's muli by 100\n For ex: your input is 2, so 2 * 100 = 200 msgs send to VICTIM ");
			  mess = obj.scanner.nextInt();
			if (mess >= 9)
				System.out.println("This is " + mess + "Invalid option please enter valid number : ");
			else
				System.out.println("You mean " + mess * 100 + " messages, You want to send your friend");
		        limit = mess* 100;
		        // test
		        //System.out.println(obj.limit);
		        break;
		}
		case 2: {
			System.out.println(YELLOW_BOLD+"Give number it's muli by 100\n For ex: your input is 2, so 2 * 100 = 200 msgs send to VICTIM ");
			  mess = obj.scanner.nextInt();
			if (mess >= 9)
				System.out.println("This is " + mess + "Invalid option please enter valid number : ");
			else
				System.out.println("You mean " + mess * 1000 + " messages, You want to send your friend");
			limit = mess * 1000;
			 break;
		}
		case 3: {
			System.out.println(YELLOW_BOLD+"Give number it's muli by 100\n For ex: your input is 2, so 2 * 100 = 200 msgs send to VICTIM ");
			  mess = obj.scanner.nextInt();
			if (mess >= 9)
				System.out.println("This is " + mess + "Invalid option please enter valid number : ");
			else
				System.out.println("You mean " + mess * 10000+ " messages, You want to send your friend");
			limit =  mess * 10000;
			 break;
		}
		case 4: {
			System.out.println(YELLOW_BOLD+"Give number it's muli by 100\n For ex: your input is 2, so 2 * 100 = 200 msgs send to VICTIM ");
			  mess = obj.scanner.nextInt();
			if (mess >= 9)
				System.out.println("This is " + mess + "Invalid option please enter valid number : ");
			else
				System.out.println("You mean " + mess * 100000 + " messages, You want to send your friend");
			limit = mess * 100000;
			 break;
		}
		case 5: {
			System.out.println(YELLOW_BOLD+"Give number it's muli by 100\n For ex: your input is 2, so 2 * 100 = 200 msgs send to VICTIM ");
			  mess = obj.scanner.nextInt();
			if (mess >= 9)
				System.out.println("This is " + mess + "Invalid option please enter valid number : ");
			else
				System.out.println("You mean " + mess * 1000000 + " messages, You want to send your friend");
			limit = mess * 1000000;
			 break;
		}
		case 6: {
			System.out.println(YELLOW_BOLD+"Give number it's muli by 100\n For ex: your input is 2, so 2 * 100 = 200 msgs send to VICTIM ");
			  mess = obj.scanner.nextInt();
			if (mess >= 9)
				System.out.println("This is " + mess + "Invalid option please enter valid number : ");
			else
				System.out.println("You mean " + mess * 10000000 + " messages, You want to send your friend");
			limit = mess * 10000000;
			 break;
		}
		case 7: {
			System.out.println(YELLOW_BOLD+"Give number it's muli by 100\n For ex: your input is 2, so 2 * 100 = 200 msgs send to VICTIM ");
			  mess = obj.scanner.nextInt();
			if (mess >= 2)
				System.out.println("This is " + mess + "Invalid option please enter valid number : ");
			else
				System.out.println("You mean " + mess * 100000000 + " messages, You want to send your friend");
			limit = mess * 100000000;
			 break;
		}
		case 8: {
			System.out.println(YELLOW_BOLD+"Enter your msg's limit : ");
			limit = obj.scanner.nextInt();
			
		}
			
			
		}
	
		
	}
	
	
	
	
	
	
	

	public void whatsAppBomb() throws AWTException, InterruptedException {

		YogeshRobot obj = new YogeshRobot();

		Robot robot = new Robot();

		System.out.println("Enter your message: ");
		String message = obj.scanner.nextLine();

		StringSelection stringSelection = new StringSelection(message);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		System.out.println("\nFucking start with in 5 sec");

		Thread.sleep(5000);

		int start = 1;
		

		// 2ND BANNER
		obj.bannerYogesh2();

		
		
		
		
		// take input from user how many msg's to send victim chat box
		
		obj.countMessages();
		
		/*
		 * System.out.println("How many msg's you want?"); 
		 * limit = obj.scanner.nextInt();
		 */
		
		
		
		
		
		
		// delay time to send per msg, it mean msg to msg time 
		System.out.println("\nHow much delay you want ? in seconds..");
		sec = obj.scanner.nextInt();

		//given time to open the chat box and just move courser in typer
		System.out.println(
				"You have 5 seconds open the what's web and \n" + "open victim chat let's boom.................");

		Thread.sleep(5000);
	
		// this is for testing
		System.out.println(limit);

		/*
		 * this is the main logic....
		 */
		while (start <= limit) {
			Thread.sleep(sec);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			// @test
			System.out.println("HELLO THIS IS SUCCESSFULLY WORKING NOW.... THIS IS FOR @TEST");
			start++;
		}
		System.out.println(RED_BOLD+"YOUR TASK IS COMPLTETED");

	}

	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException {
		// Application to run
		YogeshRobot robot = new YogeshRobot();
		robot.options();

	}

}
