package com.Whatsapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class YogeshRobot {
	
	Scanner scanner=new Scanner(System.in);
	int limit;
	int sec;
	int start = 1;
	
	
	public void bannerYogesh()  {

		  System.out.println("-------------------------------------------------------");
		  System.out.println("-----------WEL COME TO WHATS APP FUCKER BOMB-----------");
		  System.out.println("---------------THIS IS FOR ONLY COMPUTERS--------------");
		  System.out.println("-----------------JUST GIVE SOME INPUTS-----------------");
		  System.out.println("--------------AND OPEN YOUR WHATS APP WEB--------------");
		  System.out.println("----------------IN YOUR DESKTOP OR LAPTOP--------------");
		  System.out.println("-------------------------------------------------------");
		  System.out.println("-----------------------@YOGESH JOGA--------------------");
		  System.out.println("------------IM THE JAVA EXPERT I LOVE CODING-----------");
		  System.out.println("-------------------------------------------------------");
		  System.out.println("This is educational purpose don't use illegal purpose  \n"
		  				   + "just enjoy the tools and make fun with your friends    \n"
		  				   + "*******************************************************\n"
		  				   + "****************Author @Yogesh Joga********************\n"
		  				   + "*******************************************************\n"
		  				   + "*******************************************************\n");
		  
		  
    }
	
	
	
	public void bannerYogesh2() {
		System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***************HOW MANY MSG'S******************");
        System.out.println("**************YOU NEED TO SEND*****************");
        System.out.println("*************YOUR FUCKING FRIEND***************");
        System.out.println("*******************AND*************************");
        System.out.println("************WHAT IS THE DELAY TIME*************");
        System.out.println("****************GIVE DELAY TIME****************");
        System.out.println("**************AS IN MILLI SECONDS**************");
        System.out.println("***********************************************");
		
	}
	
	
	
	
	public void inputs() {
		
	    System.out.println("Enter your message: ");
	}
	
	
	
	
	
	
	
	
	public void whatsAppBomb()throws AWTException,InterruptedException {
		
		YogeshRobot obj = new YogeshRobot();
		//1st Banner
		obj.bannerYogesh();
		
		
	    Robot robot=new Robot();
	   
	    System.out.println("Enter your message: ");
	    String message = obj.scanner.nextLine();
	    
	    
        StringSelection stringSelection = new StringSelection(message);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);
        
        
        System.out.println("\n\n\nFucking start with in 5 sec");
        
        Thread.sleep(5000);
        
        int start =1;
        int limit;
        
        
        //2ND BANNER 
        obj.bannerYogesh2();
        
        
        System.out.println("How many msg's you want?");
 	    limit = obj.scanner.nextInt();
 	
        
        System.out.println("How much delay you want ? in seconds..");
   	    sec = obj.scanner.nextInt();
   	    
        
        
        
       
        
		while(start <= limit){
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
			
	  public static void main(String[]args)throws AWTException,InterruptedException{
		  //Application to run 
		  YogeshRobot robot = new YogeshRobot();
		  robot.whatsAppBomb();
		    
	}

}
