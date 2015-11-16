
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
    
    /*
     * Constructor que inicializa a oo:oo
     */
    public ClockDisplay()
    {
       horas = new NumberDisplay(24);
       minutos = new NumberDisplay(60);
       actualHoraDisplay();
    }
    
    /*
     * Constructor qye devuelve hora actual
     */
    public void actualHoraDisplay()
    {
        horaActual = horas.getDisplayValue() + ":" +
                     minutos.getDisplayValue();
    }
    
    /*
     * Constructor para dar la hora y minutos dados
     */
    public ClockDisplay(int hora, int minuto)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        setTime(hora, minuto);
    }
    
    /*
     * Constructor dar hora actual
     */
        public String getTime()
    {
        return horaActual;
    }
    
    /*
     * Constructor poner hora fija sin devolver
     */
    public void setTime(int hora, int minuto)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);
        actualHoraDisplay();
    }
    
    /*
     * Constructor que incrementa los minutos y las horas si son necesarias
     */
    public void timeTick()
    {
        minutos.increment();
        if(minutos.getValue() == 0) {
            horas.increment();
        }
        actualHoraDisplay();
    }
}
