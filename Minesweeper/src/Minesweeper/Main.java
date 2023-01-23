package Minesweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayGrid(10,10);
		System.out.println("                                   #######################");
		System.out.println("                                   #     Minesweeper     #");
		System.out.println("                                   #######################\n");
		
		Grid currentGrid = new Grid(10,10,10);
		Scanner keyboard = new Scanner(System.in);
		
		
		while(!currentGrid.gameLost || currentGrid.gameWon) {
			char command='S';
			boolean validCommand = false;
			while(!validCommand) {
				System.out.println("Select the action you wish to take. Enter 'F' if you wish to set a Flag, 'U' if you wish to unset a Flag or 'S' if you wish to select a grid positon:");
				command = keyboard.next().charAt(0);
				if(command=='F') {
					validCommand = true;
				}else if(command=='S'){
					validCommand = true;
				}else if (command=='U') {
					validCommand=true;
				}else {
					System.out.printf("%s is not a valid command. Please select either 'F' to set a Flag or 'S' to select a grid position",command);
				}
			}
			
			boolean validCoordinates = false;
			int x;
			int y;
			while(!validCoordinates) {
				System.out.println("\nSelect x and y coordinates:");
				x = keyboard.nextInt();
				y = keyboard.nextInt();
				
				if(x>=0 && y>=0 && x<currentGrid.xmax && y<currentGrid.ymax) {
					validCoordinates=true;
					if(command == 'F') {
						currentGrid.setFlagOnGrid(x, y);
						currentGrid.displayGrid();
					}
					if(command == 'U') {
						currentGrid.unsetFlagOnGrid(x, y);
						currentGrid.displayGrid();
					}
					else {
						currentGrid.selectCell(x, y);
						currentGrid.displayGrid();
					}
					
				}
			}
			
			

			
			
		}
		
	}
	

}
