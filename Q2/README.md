# ENSE 370 Winter 2020 Final Exam – Question 2

**PROMPT**: Consider the following implementation of a Car class:

~~~~

public class Car 
{
    public static void main(String[] args) 
    {
        Wheel wheel[];
        wheel = new Wheel[4];
        
        for (int i=0; i<4; i++) 
        {
            wheel[i] = new Wheel();
            wheel[i].rim = new Rim();
            wheel[i].rim.size = 16; // sets each rim size to 16
        }
    }
}

public class Wheel 
{
    public Rim rim;
    public Tyre tyre; // this class is not implemented here
}

public class Rim 
{
    public int size;
}
~~~~
Explain why the above code is undesirable and refactor it to make it better.
