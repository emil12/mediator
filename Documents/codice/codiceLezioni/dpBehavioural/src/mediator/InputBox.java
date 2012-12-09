package mediator;

// InputBox e' un ConcreteColleague

public class InputBox extends Colleague {
	private Console c = Console.getInstance();

	private int posX, posY;

	public InputBox(int y, int x) {
		posX = x;
		posY = y;
	}

	public void setPosition(int y, int x) {
		posX = x;
		posY = y;
	}

	public String show() {
		c.bold();
		c.red();
		c.position(posY, posX - 2);
		System.out.print(">     <");

		c.position(posY, posX);
		String s = c.takeInput();
		c.normal();
		
		c.delete(posY, posX - 2);
		return s;
	}
}
