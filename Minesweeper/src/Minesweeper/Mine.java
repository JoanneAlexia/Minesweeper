package Minesweeper;

import java.util.Arrays;
import java.util.List;

public class Mine implements cell {
	private String type = "mine"; 
	private int x; 
	private int y; 
	private boolean visible = false; 
	
	public Mine(int x, int y) {
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
	
	public void display() {
		if(this.visible) {
			System.out.print("|   X   |");
		}else {
			System.out.print("|       |");
		}
	}
}
