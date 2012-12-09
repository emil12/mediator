package mediator;

// Text e' un ConcreteColleague

public class Text extends Colleague {
	private Console c = Console.getInstance();

	private String content = "Text:";

	public void show() {
		c.position(4, 1);
		c.normal();
		System.out.print(content);
	}

	public void add(String s) {
		content = content.concat("\n" + s);
		show();
	}
	
	// Qui potrei avere un metodo che prende l'input dalla tastiera ed invoca mediator.select
}
