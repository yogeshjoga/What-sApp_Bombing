package whatsapp.com.whatspprobot.banners;

public class Banners {
	/**
	 * @author_Yogesh_Joga
	 * this class for only banners creation
	 * user anywhere with out distrubing any other classes.
	 * let's start coding.........
	 */
	
	
	
	
	// colors-imported
		static String RED_BOLD = "\033[1;91m"; 
		static String GREEN_BOLD = "\033[1;92m";
		static String YELLOW_BOLD = "\033[1;93m";
	
	// This banner for WhatsAppNumbeCration
		public void bannerWhatsMain() throws InterruptedException {

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
