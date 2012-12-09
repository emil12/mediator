package mediator;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

	private static Console instance;

	private Console() {
	}

	public static Console getInstance() {
		if (null == instance)
			instance = new Console();
		return instance;
	}

	public void clearScreen() {
		System.out.print((char) 27 + "[2J");
	}

	public void delete(int r, int c) {
		System.out.print((char) 27 + "[" + r + ";" + c + "f");
		System.out.print((char) 27 + "[K");
	}

	public void position(int r, int c) {
		System.out.print((char) 27 + "[" + r + ";" + c + "f");
	}

	public void red() {
		System.out.print("\033[47;31m");
	}

	public void green() {
		System.out.print("\033[32m");
	}

	public void black() {
		System.out.print("\033[30m");
	}

	public void bold() {
		System.out.print("\033[1m");
	}

	public void normal() {
		System.out.print("\033[0m");
	}

	public String takeInput() {
		//normal();
		//position(1,1);
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			String str = "";
			while (str != null) {
//				System.out.print(">  ");
				return in.readLine();
				
				// in.read()  restituisce un int
			}
		} catch (IOException e) {
		}
		return null;
	}

	public void getMousePosition() {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();

		System.out.print(x + ":" + y);
	}

}
