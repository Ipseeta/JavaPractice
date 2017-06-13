package practiceproject;
/**
 * A robot is located in the upper-left corner of a 4×4 grid. 
 * The robot can move either up, down, left, or right, but cannot go to the same location twice. 
 * The robot is trying to reach the lower-right corner of the grid. 
 * Objective is to find out the number of unique ways to reach the destination.
 * @author Ipseeta
 *
 */
public class RobotMovement {
	static int numOfPaths = 0;

	public static void main (String[] args) {
		int[][] field = new int[4][4];
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++){
				field[i][j] = 0;
			}
		}
		field[0][0] = 1;
		robotMoves(0, 0, field);// robot has not moved yet. Hence the current position is [0,0]
		System.out.println("The number of unique ways to reach the destination is " +numOfPaths);
	}
	/**
	 * This method is recursively called to calculate the bot movement
	 * Logic : whenever it arrives at the down right corner it increments the number of paths
	 * @param row row of the grid
	 * @param column column of the grid
	 * @param field array for representing the position of the bot in the grid
	 */
	static void robotMoves(int row, int column, int[][] field){
		robotMovesUp(row, column, field);
		robotMovesDown(row, column, field);
		robotMovesLeft(row, column, field);
		robotMovesRight(row, column, field);
	}
	/**
	 * This method is recursively called to calculate the bot movement upwards
	 * @param row row of the grid
	 * @param column column of the grid
	 * @param field array for representing the position of the bot in the grid
	 */
	static void robotMovesUp(int row, int column, int[][] field){
		if (row == 0) return;
		else {
			if (field[row-1][column] == 1) return;
			field[row-1][column] = 1;//1 means the robot has passed through that position
			robotMoves(row-1, column, field);
			field[row-1][column] = 0;
		}
	}
	/**
	 * This method is recursively called to calculate the bot movement downwards
	 * @param row row of the grid
	 * @param column column of the grid
	 * @param field array for representing the position of the bot in the grid
	 */
	static void robotMovesDown(int row, int column, int[][] field){
		if (row == 3 && column == 3) {
			numOfPaths++;
			return;
		}
		else if (row == 3) return;
		else {
			if (field[row+1][column] == 1) return;
			field[row+1][column] = 1;//1 means the robot has passed through that position
			robotMoves(row+1, column, field);
			field[row+1][column] = 0;
		}
	}
	/**
	 * This method is recursively called to calculate the bot movement in left direction
	 * @param row row of the grid
	 * @param column column of the grid
	 * @param field array for representing the position of the bot in the grid
	 */
	static void robotMovesLeft(int row, int column, int[][] field){
		if (column == 0) return;
		else {
			if (field[row][column-1] == 1) return;
			field[row][column-1] = 1;//1 means the robot has passed through that position
			robotMoves(row, column-1, field);
			field[row][column-1] = 0;
		}
	}
	/**
	 * This method is recursively called to calculate the bot movement in right direction
	 * @param row row of the grid
	 * @param column column of the grid
	 * @param field array for representing the position of the bot in the grid
	 */
	static void robotMovesRight(int row, int column, int[][] field){
		if (column == 3 && row == 3) {
			numOfPaths++;
			return;
		} else if (column == 3) return;
		else {
			if (field[row][column+1] == 1) return;
			field[row][column+1] = 1;//1 means the robot has passed through that position
			robotMoves(row, column+1, field);
			field[row][column+1] = 0;
		}
	}

}
