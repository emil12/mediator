package mediator;

// Button e' un ConcreteColleague

public class TextButton extends Colleague {
	private String nome;
	private boolean active = false;
	private int positionX = 1;
	private int positionY = 1;

	private Console c = Console.getInstance();

	public TextButton(String s, int y) {
		nome = s;
		positionY = y;
	}

	public TextButton(String s, int y, int x) {
		nome = s;
		positionY = y;
		positionX = x;
	}

	public void activate() {
		active = true;
		show();
	}

	public void deactivate() {
		active = false;
		show();
	}

	public void show() {
		if (active)
			c.bold();
		else
			c.normal();

		c.position(positionY, positionX);
		System.out.print("[" + nome + "]");
	}
}
