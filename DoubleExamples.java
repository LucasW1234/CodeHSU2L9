// Integer and Double are in
// java.lang package


import java.lang.*;

public class DoubleExamples
{
    public static void main(String[] args)
    {
        // Explictly create a Double
        Double x = new Double (16.8);
        // you could also use Double x = 16.8
        
        // Use autoboxing to have
        // Java convert the double value
        // to an Double object
        Double y = 20.2;
        
        // Can use Doubles exactly like
        // you can use doubles because
        // of autoboxing
        System.out.println ("the value of x is: "+x);
        
        
        // Can also use the doubleValue value
        // to get the underlying double
        System.out.println ("the value of y is: "+y.doubleValue());
        
        
        // One instance where unboxing doesn't work
        // is when converting from a double to an int
        
        //int wholeNumber = (int) x; doesn't work
        int wholeNumber = (int) x.doubleValue();
        
        
    }
}