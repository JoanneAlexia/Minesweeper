package Minesweeper;

import java.util.Arrays;
import java.util.List;

public abstract class Cell {
	private String type;
	private int x; 
	private int y; 
	private boolean visible = false; 
	private boolean flag = false;
	
	public Cell(int x, int y, String type) {
		this.x=x;
		this.y=y;
		this.type=type;
	}
	
	public abstract void display();
	
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
	
	public boolean getVisible() {
		return this.visible;
	}
	
	public boolean getFlag() {
		return this.flag;
	}
	
	public void setFlag() {
		if(!this.visible) {
			this.flag = true;
		}
	}
	
	public void unsetFlag() {
		if(this.flag==true) {
			this.flag = false;
		}
	}
}
