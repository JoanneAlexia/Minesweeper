package Minesweeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayGrid(10,10);
		Grid currentGrid = new Grid(10,10,5);
		currentGrid.selectCell(0, 0);
		currentGrid.selectCell(6, 5);
		currentGrid.selectCell(7, 5);
		currentGrid.selectCell(9, 0);
		currentGrid.displayGrid();
	}
	

}
