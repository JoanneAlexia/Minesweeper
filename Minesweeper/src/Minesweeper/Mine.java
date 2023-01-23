package Minesweeper;

public class Mine extends Cell{
	private String type; 
	
	public Mine(int x, int y, String type) {
		super(x,y,type);
	}

	public void display() {
		if(getVisible()) {
			System.out.print("|   X   |");
		}else {
			System.out.print("|       |");
		}
	}
}
