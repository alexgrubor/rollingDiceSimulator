
package rollingDiceSimulator;
import java.util.Random;

public class rollingDiceSimulator {

	public static void main(String[] args) {
	Random random = new Random();
	int rolledNum = random.nextInt(6) + 1;
	 System.out.println(rolledNum);

	}

}
