
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    private int limitNumber;
    
    private int display;
    private int display1;
    
    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limitNumber, int display1)
    {
        display = 0;
    }

    public void setValue()
    {
        display =  display1;
    }
    
    public String getDisplayValue()
    {
        String displaY = "%02d";
        String resultado = String.format(displaY,display);
        return resultado;
    }
}
