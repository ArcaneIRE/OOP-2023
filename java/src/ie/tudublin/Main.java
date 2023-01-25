package ie.tudublin;

public class Main
{
	public static void main(String[] args)
	{	
		Cat tara = new Cat("Ginger");
		tara.speak();
    while (tara.isAlive()) {
      tara.kill();
    }
    tara.kill();
	}
	
}