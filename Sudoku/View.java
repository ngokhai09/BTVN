package BTVN.Sudoku;
import java.util.Scanner;

public class View {
	private Scanner scan = new Scanner(System.in);
	
	private int N = 9;
	private int N2 = 3;
	private int[][] node = { { 0, 8, 0, 7, 0, 1, 0, 3, 0 }, { 4, 0, 9, 0, 0, 0, 0, 0, 0 },
			{ 0, 5, 0, 0, 6, 0, 4, 1, 8 }, { 7, 0, 0, 0, 0, 9, 0, 0, 0 }, { 8, 0, 0, 6, 1, 0, 5, 0, 0 },
			{ 0, 3, 5, 0, 0, 0, 0, 2, 9 }, { 0, 6, 0, 4, 0, 7, 0, 9, 0 }, { 1, 0, 0, 0, 0, 8, 0, 0, 4 },
			{ 0, 2, 0, 0, 5, 0, 0, 7, 0 } };
	
	public int[][] getNode() {
		return node;
	}

	public int getN() {
		return N;
	}

	public void setNode(int[][] node, int x, int y, int value) {
		node[x][y] = value;
		this.node = node;
	}

	public int getN2() {
		return N2;
	}

	public void show() {
		System.out.println("Game: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(node[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	public Model getGameInput() {
		Model m = new Model();
		System.out.printf("x = ");
		m.setX(scan.nextInt() - 1);
		System.out.printf("y = ");
		m.setY(scan.nextInt() - 1);
		System.out.printf("value = ");
		m.setValue(scan.nextInt());
		return m;
	}
}
