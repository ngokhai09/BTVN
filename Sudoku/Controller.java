package BTVN.Sudoku;
public class Controller {
	private View v;
	private boolean status;
	
	public Controller(View v) {
		this.v = v;
	}
	
	public void play() {
		while (true) {
			v.show();
			
			Model m = v.getGameInput();
			
			status = checkReserved(m, v);
			if (status) {
				System.out.println("Khong duoc dien vao vi tri nay");
				continue;
			}
			status = checkRow(m, v);
			if (status) {
				System.out.println("Trung hang. Nhap lai di");
				continue;
			}
			status = checkColumn(m, v);
			if (status) {
				System.out.println("Trung cot. Nhap lai di");
				continue;
			}
			status = checkZone(m, v);
			if (status) {
				System.out.println("Trung vung. Nhap lai di");
				continue;
			}
			v.setNode(v.getNode(), m.getX(), m.getY(), m.getValue());
			
			status = checkFinish(m, v);
			if (status) {
				System.out.println("Choi tiep di");
				continue;
			}
			System.out.println("Congratulation!");
			break;
		}
	}
	
	public boolean checkRow(Model m, View v) {
		for (int j = 0; j < v.getN(); j++) {
			if (v.getNode()[m.getX()][j] == m.getValue()) {
				return true;
			}
		}
		return false;
	}

	public boolean checkColumn(Model m, View v) {
		for (int i = 0; i < v.getN(); i++) {
			if (v.getNode()[i][m.getY()] == m.getValue()) {
				return true;
			}
		}
		return false;
	}

	public int getZone(int x, int y) {
		return x / v.getN2() * v.getN2() + y / v.getN2();
	}

	public boolean checkZone(Model m, View v) {
		int zone = getZone(m.getX(), m.getY());
		for (int i = 0; i < v.getN(); i++) {
			for (int j = 0; j < v.getN(); j++) {
				int z = getZone(i, j);
				if (z == zone &&  v.getNode()[i][j] == m.getValue()) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkFinish(Model m, View v) {
		for (int i = 0; i < v.getN(); i++) {
			for (int j = 0; j < v.getN(); j++) {
				if (v.getNode()[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkReserved(Model m, View v) {
		if (v.getNode()[m.getX()][m.getY()] != 0) {
			return true;
		}
		return false;
	}
}
