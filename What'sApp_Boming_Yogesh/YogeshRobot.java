package com.Whatsapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class YogeshRobot extends Canvas {

	/**
	 * @author Yogesh_joga
	 */
	private static final long serialVersionUID = 1L;
	Scanner scanner = new Scanner(System.in);
	int limit;
	int sec;
	int start = 1;

	public void mainBannerYogesh() throws FileNotFoundException, InterruptedException {

		File file = new File("D:\\java8\\java8fet\\src\\com\\Whatsapp\\MyNameArtYogesh.txt");
		Scanner reader = new Scanner(file);

		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			System.out.println(line);
			Thread.sleep(100);
		}

		System.out.println("\n\n\n");
		Thread.sleep(1000);
	}

	public void bannerYogesh() throws InterruptedException {
		/*
		 * System.out.println("-------------------------------------------------------")
		 * ;
		 * System.out.println("-----------WEL COME TO WHATS APP FUCKER BOMB-----------"
		 * );
		 * System.out.println("---------------THIS IS FOR ONLY COMPUTERS--------------"
		 * );
		 * 
		 * 
		 * System.out.println("-----------------JUST GIVE SOME INPUTS-----------------"
		 * );
		 * System.out.println("--------------AND OPEN YOUR WHATS APP WEB--------------"
		 * );
		 * System.out.println("----------------IN YOUR DESKTOP OR LAPTOP--------------"
		 * );
		 * 
		 * System.out.println("-------------------------------------------------------")
		 * ;
		 * System.out.println("-----------------------@YOGESH JOGA--------------------"
		 * );
		 * System.out.println("------------IM THE JAVA EXPERT I LOVE CODING-----------"
		 * );
		 * System.out.println("-------------------------------------------------------")
		 * ;
		 * 
		 * 
		 * System.out.
		 * println("This is educational purpose don't use illegal purpose  \n" +
		 * "just enjoy the tools and make fun with your friends    \n" +
		 * "*******************************************************\n" +
		 * "****************Author @Yogesh Joga********************\n" +
		 * "*******************************************************\n" +
		 * "*******************************************************\n");
		 * 
		 */
		String bannerYogesh = 	  "-------------------------------------------------------\n"
								+ "-----------WEL COME TO WHATS APP FUCKER BOMB-----------\n"
								+ "---------------THIS IS FOR ONLY COMPUTERS--------------\n"
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
								+ "*******************************************************\n";

		for (int i = 0; i < bannerYogesh.length(); i++) {
			System.out.print(bannerYogesh.charAt(i));
			Thread.sleep(20);
		}

	}

	public void bannerYogesh2() throws InterruptedException {

		String bannerYogi =   "*********************************************************\n"
							+ "*********************************************************\n"
							+ "********************HOW MANY MSG'S***********************\n"
							+ "*******************YOU NEED TO SEND**********************\n"
							+ "******************YOUR FUCKING FRIEND********************\n"
							+ "***********************AND*******************************\n"
							+ "*****************WHAT IS THE DELAY TIME******************\n"
							+ "*********************GIVE DELAY TIME*********************\n"
							+ "*******************AS IN MILLI SECONDS*******************\n"
							+ "*********************************************************\n";

		for (int i = 0; i < bannerYogi.length(); i++) {
			System.out.print(bannerYogi.charAt(i));
			Thread.sleep(20);
		}

	}

	public void whatsAppBomb() throws AWTException, InterruptedException {

		YogeshRobot obj = new YogeshRobot();
		// 1st Banner
		obj.bannerYogesh();

		Robot robot = new Robot();

		System.out.println("Enter your message: ");
		String message = obj.scanner.nextLine();

		StringSelection stringSelection = new StringSelection(message);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		System.out.println("\n\n\nFucking start with in 5 sec");

		Thread.sleep(5000);

		int start = 1;
		int limit;

		// 2ND BANNER
		obj.bannerYogesh2();

		System.out.println("How many msg's you want?");
		limit = obj.scanner.nextInt();

		System.out.println("How much delay you want ? in seconds..");
		sec = obj.scanner.nextInt();

		System.out.println(
				"You have 5 seconds open the what's web and \n" + "open victim chat let's boom.................");

		Thread.sleep(5000);

		while (start <= limit) {
			Thread.sleep(sec);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("ehllo");
			obj.start++;

		}

	}

	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException {
		// Application to run

		YogeshRobot robot = new YogeshRobot();
		robot.mainBannerYogesh();
		robot.whatsAppBomb();

	}

}
