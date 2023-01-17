package Minesweeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Grid {
	List<List<cell>> gridList = new ArrayList<>();
	int xmax;
	int ymax;
	int numberOfMines;
	ArrayList<List<Integer>> mineLocations;
	
	
	public Grid(int xmax,int ymax,int numberOfMines) {
		this.xmax=xmax;
		this.ymax=ymax;
		this.numberOfMines=numberOfMines;
		setMineLocations();
		initalizeGrid();
	}
	
	private void initalizeGrid() {
	 for(int i = 0; i < xmax; i++)  {
	        gridList.add(new ArrayList<cell>());
	  }
		 
		for(int i=0; i<this.xmax; i++) {
			for(int j=0; j<this.ymax; j++) {
				if(this.mineLocations.contains(Arrays.asList(i,j))){
					gridList.get(i).add(new Mine(i,j));
				}
				else{
					gridList.get(i).add(new Blank(i,j));
				}
			}
		}
	}
	
	private void setMineLocations(){
		this.mineLocations = new ArrayList<>(); 
		Random rand = new Random();
		
		for(int i=0;i<this.numberOfMines; i++) {
			boolean coordinateNotAdded = true;
			do {
				int x = rand.nextInt(this.numberOfMines);
				int y = rand.nextInt(this.numberOfMines);
				if(!this.mineLocations.contains(Arrays.asList(x,y))){
					this.mineLocations.add(Arrays.asList(x,y));
					coordinateNotAdded = false;
				}
			}while(coordinateNotAdded);	
		}
	}
	
	public void selectCell(int i, int j) {
		gridList.get(i).get(j).setVisible();
	}
	
	public void displayGrid() {
		for(int i=0;i<=this.ymax*3+1;i++) {
			if(i%3==0 && i!=0) {
				//Each cell takes up 3 lines. 
				//Display the y-coordinate in the middle row of the cell hence i%3 and only
				//Don't display the y-coordinate on the same line the x-coordinates are displayed
				//hence the i!=0.
				
				System.out.printf("%2d",(i-1)/3);
			}else {
				System.out.print("  ");
			}
			for(int j=0;j<this.xmax;j++) {
				if(i==0 ) {
					//Display first x-coordinates on the first line
					System.out.printf("    %d    ",j);
				}else if(i==1) {
					//Upper grid border
					System.out.print(" _______ ");
				}
				else if(i%3==2) {
					System.out.print("|       |");
				}
				else if(i%3!=1) {
					gridList.get((i-1)/3).get(j).display();
				}
				else{
					System.out.print("|_______|");
				}
			}
			System.out.print("\n");
		}
		
	}
}
