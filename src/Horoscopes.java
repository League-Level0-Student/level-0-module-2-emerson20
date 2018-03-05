import javax.swing.JOptionPane;

public class Horoscopes {public static void main(String[] args) {
	//1: Ask the user for their star sign. (Zodiac Signs)
String sign = JOptionPane.showInputDialog("What is your zodiac sign? (Only use lower case lettes and make sure your spelling is correct.)");
	//2: Depending on what they answer, tell them their horoscope
if (sign.equals("capricorn")) {
	JOptionPane.showMessageDialog(null, "You are pationate, persistent, and easy going as long as something dose not involve work.");
}
else if (sign.equals("pisces")) {
	JOptionPane.showMessageDialog(null, "You'er mystic, you stand up for what you believe in,  have very strong emotions, and can understand others motives very easly.");
}	
else if (sign.equals("aquarius")) {
	JOptionPane.showMessageDialog(null, "You are a visionary, independent, good at interacting with others through observations, and have a forward thinking mind.");		
}	
else if (sign.equals("aries")) {
    JOptionPane.showMessageDialog(null, "You're very self-oriented, exiting, vibrant, talkative, natural leaders, and very impulsive.");	
}		
else if (sign.equals("taurus")) {
	JOptionPane.showMessageDialog(null, "You are solid, persistent, stubborn, you don't like change, you're easy going, good at decorating, and have ahuge tempor.");					
}				
else if (sign.equals("gemini")) {
	JOptionPane.showMessageDialog(null, "You're quick in mind and physically, you're brimming with energy and vitality, some would call you a social butterfly, you have interesting opinions on things, and are not afraid to speak you're mind.");					
}					
else if (sign.equals("cancer")) {
	JOptionPane.showMessageDialog(null, "You are mysterious, excellent at reading peoples emotions, you have an excellent memory, you need support and encouragement, and seek security and comfort, yet look for new adventures.");						
}						
else if (sign.equals("leo")) {
	JOptionPane.showMessageDialog(null, "You're emotions tend to be over dramatic from having them be amplified, also when you are sad you eather become very loud and go out with friends or you completely shut down and go into the solitude of you're room.");							
}						
else if (sign.equals("virgo")) {
	JOptionPane.showMessageDialog(null, "You are a very big perfectionist, you exist in you're mind, everything is inside, you can be very picky, and you are always trying to improve everything you see.");								
}							
else if (sign.equals("libra")) {
	JOptionPane.showMessageDialog(null, "You're alway nice to everyone, very creative, silly, funny, sweet, great at sports, and you can cause as much havoc as you can prevent.");									
}							
else if (sign.equals("scorpio")) {
	JOptionPane.showMessageDialog(null, "You are intense, deep, powerful, you have a lot of strength, you are secretive, you are also mysteryous, you are very aware, and have a strong will.");										
}								
else if (sign.equals("sagitarius")) {
	JOptionPane.showMessageDialog(null, "You're guided by luck, arnt you the bigest optimist in you're class, would some discribe you as reckless and irresponsible, and you're very vibrant and expansive.");											
}else{
	JOptionPane.showMessageDialog(null, "That is not a zodiac sign.");
}
												
												

	//3: If they enter something else, tell them "That's not a star sign!"


}

}
