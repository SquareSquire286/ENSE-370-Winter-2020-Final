public class Boot implements Shoe
{
    private String colour;
    private String material;

    public Boot()
    {
	colour = "black";
	material = "rubber";
    }
    
    public void showShoeInfo()
    {
	System.out.println("This shoe is a Boot. Its colour is " + colour + " and its material is " + material + ".");
    }
}
