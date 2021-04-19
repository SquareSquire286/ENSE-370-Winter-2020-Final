# Question 2 Response

This code is undesirable for three primary reasons:

1. `Rim` is a data class; it only exists in order to hold the `size` attribute. Since there is no meaningful purpose for the `Rim` class, it would be ideal to move its sole attribute to the `Wheel` class and rename it `rimSize`.
2. `Wheel` is a lazy class; it contains two attributes with seemingly broad potential in terms of logic and values, but does not perform any operations on them. Instead, the `Rim.size` attribute is assigned values in the `main()` function of `Car`, which creates unnecessary complexity in said function.
3. The `main()` function of `Car` has multiple issues related to variable scope and "magic numbers," as they were described in the 370 labs. For one, the array of `Wheel` objects is not configured as a native attribute of `Car`, and is instead instantiated in `main()` at runtime. Complexity within `main()` could be reduced if this array's scope was promoted to class-level, rather than method-level. Secondly, the `for` loop in `main()` relies on the magic number of 4, which is an undesirable hard-coded value. Replacing this integer value with `wheels.length` would be preferable in terms of encapsulating class data.

If I were to refactor this code, I would implement the following changes:
~~~~
public class Car
{
    private Wheel[] wheels;
    
    public Car()
    {
        wheels = new Wheel[4];
    }
    
    public void configureWheels(int size)
    {
        for (Wheel wheel : wheels)
            wheel.setRimSize(size);
    }
    
    public static void main(String[] args)
    {
        Car car = new Car();
        car.configureWheels(16);
        return;
    }
}
~~~~
~~~~
public class Wheel
{
    private int rimSize;
    private Tyre tyre; // not implemented here
    
    public void setRimSize(int rimSize)
    {
        this.rimSize = rimSize;
    }
}
~~~~
