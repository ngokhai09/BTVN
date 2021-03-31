package BTVN.Sudoku;
public class App {
	public static void main(String[] args) {
		View v = new View();
		Controller ctr = new Controller(v);
		ctr.play();
	}
}
