package whatsapp.com.whatspprobot.csvdownload;

public class WhatsAppNumberCreation {
  /**
   * @author_Yogesh_Joga_____
   * Here creating what's app valid numbers.
   *  Take input of example Phone number contains only 10 digits allow 
   *  Below 10 not accepted and Above 10 not accepted.
   *  Let's Start coding.
   */
	
	// colors-imported
	static String RED_BOLD = "\033[1;91m"; 
	static String GREEN_BOLD = "\033[1;92m";
	static String YELLOW_BOLD = "\033[1;93m";
	
	
	// print banner 
	public void bannerWhatsAppNumberCration() throws InterruptedException {

		String bannerYogi = "*********************************************************\n"
				+ "*********************************************************\n"
				+ "********** HOW MANY NUMBERS YOU NEED TO GENRATE? ********\n"
				+ "***************   ONLY 10 DIGITS SUPPORTED   ************\n"
				+ "************     VALIDATE WHAT'S APP NUBMER  ************\n"
				+ "*****   AFTER GENRATE THE NUMBERS JUST DOWNLOAD IT   ****\n"
				+ "**************** THANK YOU FOR USING ********************\n"
				+ "*********************************************************\n"
				+ "******************* @ version new version  **************\n"
				+ "******************  Relese Date 14/05/2023  *************\n"
				+ "*********************************************************\n";

		for (int i = 0; i < bannerYogi.length(); i++) {
			System.out.print(GREEN_BOLD+bannerYogi.charAt(i));
			Thread.sleep(3);
		}

	}
}
