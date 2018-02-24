//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown – or the rocket won’t launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) {
	
		// 2. Use a pop-up to ask the user where to start counting from
String count = JOptionPane.showInputDialog("Where do we start our countdown form?");
		// 3. Change the countdown to use the new starting point
		int number = Integer.parseInt(count);
		// 1. Print a countdown from 10 to 0 on the console
for(int i=number;i >= 0;i--) {
		// 4. Use the speak method to hear the countdown.
		speak(i+"");
		// 5. when the counting is done, speak "blastoff!"
}
JOptionPane.showMessageDialog(null, "BLASTOFF!!!");
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say -v Alex " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


