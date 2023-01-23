package Minesweeper;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Blank extends Cell{
	private int numberOfAdjacentMines = 0;

	
	public Blank(int x, int y, String type) {
		super(x,y,type);
	}
	
	
	public int setnumberOfAdjacentMines(ArrayList<List<Integer>> mineLocations) {
		//i-1, j-1
		if(mineLocations.contains(Arrays.asList(getCoordinates().get(0)-1, getCoordinates().get(1)-1))&& getCoordinates().get(0)-1>=0 && getCoordinates().get(1)-1>=0 ) {
			this.numberOfAdjacentMines++;
		};
		//i-1, j
		if(mineLocations.contains(Arrays.asList(getCoordinates().get(0)-1, getCoordinates().get(1))) && getCoordinates().get(0)-1>=0 && getCoordinates().get(1)>=0) {
			this.numberOfAdjacentMines++;
		};
		//i-1, j+1
		if(mineLocations.contains(Arrays.asList(getCoordinates().get(0)-1, getCoordinates().get(1)+1))&& getCoordinates().get(0)-1>=0 && getCoordinates().get(1)+1>=0) {
			this.numberOfAdjacentMines++;
		};
		//i,j-1
		if(mineLocations.contains(Arrays.asList(getCoordinates().get(0), getCoordinates().get(1)-1)) && getCoordinates().get(0)>=0 && getCoordinates().get(1)-1>=0) {
			this.numberOfAdjacentMines++;
		};
		//i,j+1
		if(mineLocations.contains(Arrays.asList(getCoordinates().get(0), getCoordinates().get(1)+1)) && getCoordinates().get(0)>=0 && getCoordinates().get(1)+1>=0) {
			this.numberOfAdjacentMines++;
		};
		//i+1,j-1
		if(mineLocations.contains(Arrays.asList(getCoordinates().get(0)+1, getCoordinates().get(1)-1)) && getCoordinates().get(0)+1>=0 && getCoordinates().get(1)-1>=0) {
			this.numberOfAdjacentMines++;
		};
		//i+1,j
		if(mineLocations.contains(Arrays.asList(getCoordinates().get(0)+1, getCoordinates().get(1)))&& getCoordinates().get(0)+1>=0 && getCoordinates().get(1)>=0) {
			this.numberOfAdjacentMines++;
		};
		//i+1,j+1
		if(mineLocations.contains(Arrays.asList(getCoordinates().get(0)+1, getCoordinates().get(1)+1))&& getCoordinates().get(0)+1>=0 && getCoordinates().get(1)+1>=0) {
			this.numberOfAdjacentMines++;
		};
		
		return this.numberOfAdjacentMines;
		
	}
	
	
	public void display() {
		if(getFlag()) {
			System.out.print("|   F   |");
		}else if(getVisible()) {
			if(this.numberOfAdjacentMines ==0) {
				System.out.print("|-------|");
			}else {
				System.out.printf("|   %d   |",this.numberOfAdjacentMines);
			}
			
		}else {
			System.out.print("|       |");
		}
	}
	
}
