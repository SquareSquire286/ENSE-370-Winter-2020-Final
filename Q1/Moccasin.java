public class Moccasin implements Shoe
{
    private String colour;
    private String material;

    public Moccasin()
    {
	colour = "brown";
	material = "leather";
    }
    
    public void showShoeInfo()
    {
	System.out.println("This shoe is a Moccasin. Its colour is " + colour + " and its material is " + material + ".");
    }
}
