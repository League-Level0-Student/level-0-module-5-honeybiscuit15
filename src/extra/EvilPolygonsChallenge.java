package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot max = new Robot();

		//2. Set the speed to 100
		max.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"red","green", "blue"}, 0);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		max.penDown();
		//4. Ask the user how many polygons they want to be drawn.
		String answer = JOptionPane.showInputDialog("how many polygons you want to be drawn");
		//5. Use the robot to draw the number of polygons the user requested.
		if (answer == "square") {
for (int j = 0 ; j < 5.; j++){
				
				max.move(200);
				max.turn(90);
		}
		else if(answer=="triangle") {
			
		}else if(answer== "circle"){
			
		}else{
			
		}
		
		
		
		
		
		
		static void drawSquare() {
			
			for (int j = ; j < 5.; j++){
				
				max.move(200);
				max.turn(90);
			}
		
		}
		static void drawTriangle(){
			for(int i = 0; i<4.; i++){
				
				max.move(200);
				max.turn(120);

			
			}
		}
		static void drawCircle(){
			max.turn(1);
	} 
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

