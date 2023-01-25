package ie.tudublin;

public class Cat
{
	String name;
  private int numLives = 9;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Cat()
	{
	}
	
	public Cat(String name)
	{
    setName(name);
	}
	
	public void speak()
	{
		System.out.println("Meow");
	}

  public void kill()
  {
    if (isAlive()) {
      this.numLives -= 1;
      System.out.println("Ouch!");
    } else {
      System.out.println("The cat is dead!");
    }
  }

  public boolean isAlive()
  {
    if (this.numLives > 0) {
      return true;
    } else {
      return false;
    }
  }
}