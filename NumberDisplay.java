
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    private int limitNumber;
    
    //valor
    private int display;
    
    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limitNumber1)
    {
        limitNumber = limitNumber1;
        display = 0;
    }

    public void setValue(int display1)
    {
        display =  display1;
    }
    
    public String getDisplayValue()
    {
        String displaY = "%02d";
        String resultado = String.format(displaY,display);
        return resultado;
    }
    
    public int getValue()
    {
        return display;
    }
    
    public void increment()
    { 
        if (display < limitNumber) {
            display++;
        }
        else {
            display = 0;
        }
    }
}
