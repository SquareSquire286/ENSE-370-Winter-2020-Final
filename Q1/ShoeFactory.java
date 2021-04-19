public class ShoeFactory
{   
    public Shoe getShoe(String shoeType)
    {
	if (shoeType.equals("Sneaker"))
	    return new Sneaker();

	else if (shoeType.equals("Moccasin"))
	    return new Moccasin();

	else if (shoeType.equals("Boot"))
	    return new Boot();

	else return null;
    }
}
