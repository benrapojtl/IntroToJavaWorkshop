package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below)
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int PH = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int DH = 500;
		// 4. Create a variable to hold the damage the player's attack does each round
		int PA = 25;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int DA = 10;

		// 6. Delete the slashes at the beginning of the next line.
		while (PH > 0 && DH > 0) { // this line of code keeps the battle going until someone's health reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			String Dragon = JOptionPane.showInputDialog("do want want a kick or a yell");
			// 9. If they typed in "yell":
			if (Dragon.equalsIgnoreCase("yell")) {
				DA = new Random().nextInt(11);
				DH = DH - DA;
			}
			// 10. If they typed in "kick":
			if (Dragon.equalsIgnoreCase("kick")) {
				DA = new Random().nextInt(26);
				DH = DH - DA;
			}
			// 11. Find a random number between 0 and 35 and store it in playerDamage
PA=new Random().nextInt(36);
			// 12. Subtract this number from the player's health
PH=PH-PA;
			// 13. If the user's health is less than or equal to 0
if(PH<=0);
JOptionPane.showInputDialog("You Lost game over");

			// 14. Else if the dragon's health is less than or equal to 0
if(DH<=0);
	JOptionPane.showInputDialog("You Won!");
	JOptionPane.showInputDialog(
			"the dragonis dead and you took all the gold. "
			+ "You are now the dragon slayer, king of dragons. "
			+ "all dragons bow before you");
			// 15. Else

			// -- Pop up a message that tells the their current health and the dragon's
			// currently health (Bonus: Also display the amount of health that was lost for
			// each player this round)
JOptionPane.showMessageDialog(null,PH + "    " + DH);
		}
	}
}
