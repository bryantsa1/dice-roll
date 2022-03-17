import java.lang.Math;
import java.util.Scanner;
public class diceroll { // java class for the purpose of making rolls given an unknown number of dice with an unknown number of faces

	public static void main(String[] args) { // announces the total roll
		// TODO Auto-generated method stub
		int[] userInput = syntax();
		int diceNum = userInput[0];
		int faceNum = userInput[1];
		int total = 0;
		for (int x = 0; x < diceNum; x++) {
			total += (int)(Math.random()*faceNum)+1;
			
		}
		System.out.println(total);
	}
	
	public static int[] syntax() { // interprets the user dice roll input in the format of xdy (eg 1d20)
		Scanner input = new Scanner(System.in);
		boolean check = true;
		int dPos = 0;
		int value1 = 0;
		int value2 = 0;
		int[] values = new int[2];
		
		while (check == true) {
			System.out.print("Input: ");
			String userInput = input.nextLine();
			dPos = userInput.indexOf('d');
			if (dPos == -1) {
				System.out.println("Please input in the proper format.\n");
			}
			else {
				try {
					value1 = Integer.parseInt(userInput.substring(0,dPos));
					value2 = Integer.parseInt(userInput.substring(dPos+1));
					
					if (value1<1 || value2<4) {
						System.out.println("Please input in the proper format.\n");
					}
					else {
						check = false;
					}
				} catch (Exception e) {
					System.out.println("Please input in the proper format.\n");
				}
			}
		}
		values[0] = value1;
		values[1] = value2;
		return values;
	}
}
