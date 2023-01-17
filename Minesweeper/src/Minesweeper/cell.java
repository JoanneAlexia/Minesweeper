package Minesweeper;

import java.util.List;

public interface cell {
	public String getType();
	public void setVisible();
	public void setCoordinates(int x, int y);
	public List<Integer> getCoordinates();
	public void display();
	
}
