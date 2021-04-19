public class Sneaker implements Shoe
{
    private String colour;
    private String material;

    public Sneaker()
    {
	colour = "white";
	material = "synthetic";
    }
    
    public void showShoeInfo()
    {
	System.out.println("This shoe is a Sneaker. Its colour is " + colour + " and its material is " + material + ".");
    }
}
			     
