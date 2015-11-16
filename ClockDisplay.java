
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //horas que asignas
    private NumberDisplay horas;
    //minutos que asignas
    private NumberDisplay minutos;
    //horas actual
    private String horaActual;
    
    public ClockDisplay()
    {
       
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        updateDisplay();
    }
     
    public void updateDisplay()
    {
        
        horaActual = horas.getDisplayValue() + ":" +
                     minutos.getDisplayValue();
    }
  
    public ClockDisplay(int hora, int minuto)
    {
        
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        setTime(hora, minuto);
    }
    
        public String getTime()
    {
        return horaActual;
    }
     
    public void setTime(int hora, int minuto)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);
        updateDisplay();
    }
 
    public void timeTick()
    {
        minutos.increment();
        if(minutos.getValue() == 0) {
            horas.increment();
        }
        updateDisplay();
    }
}
