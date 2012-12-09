package mediator;

public class Test {

	public static void main(String[] args) {
		Console c = Console.getInstance();
		c.clearScreen();
		
		ConcrMediator cm = new ConcrMediator();
		cm.init();	
	}
}
