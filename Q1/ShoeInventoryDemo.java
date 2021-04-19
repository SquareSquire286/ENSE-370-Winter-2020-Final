public class ShoeInventoryDemo
{
    public static void main(String[] args)
    {
	ShoeFactory shoeFactory = new ShoeFactory();

	Shoe shoe1 = shoeFactory.getShoe("Sneaker");
	Shoe shoe2 = shoeFactory.getShoe("Moccasin");

	shoe1.showShoeInfo();
	shoe2.showShoeInfo();

	return;
    }
}
