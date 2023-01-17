package Minesweeper;

import java.util.List;
import java.util.Arrays;

public class Blank implements cell{
	private String type = "blank"; 
	private int x; 
	private int y; 
	private boolean visible = false; 
	public int numberOfAdjacentMines = 0;
	
	public Blank(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public List<Integer> getCoordinates(){
		return Arrays.asList(this.x, this.y);
	}
	
	public void setVisible() {
		this.visible = true;
	}
	
	public void setnumberOfAdjacentMines(int adjacentMines) {
		this.numberOfAdjacentMines = adjacentMines;
	}
	
	public void display() {
		if(this.visible) {
			System.out.print("|-------|");
		}else {
			System.out.print("|       |");
		}
	}
	
}
