
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
    //Atributo booleano para elejir tipo de reloj 12 horas o 24 horas
    private boolean tipos;
    /*
     * Constructor que inicializa a oo:oo
     */
    public ClockDisplay(boolean tipo)
    {
       horas = new NumberDisplay(24);//Con esto creamos un nuevo objeto de la clase NumberDisplay
       minutos = new NumberDisplay(59);//Con esto creamos un nuevo objeto de la clase NumberDisplay
       actualHoraDisplay();
       tipos = tipo;
    }
    
    /*
     * Metodo para la hora actual
     */
    public void actualHoraDisplay()
    {
       if (tipos == true){
           if (horas.getValue() > 12) {
               int hora = (horas.getValue() - 12);
               horaActual = hora + ":" + minutos.getDisplayValue() + " PM";
           }
           else{
                horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " AM";
            }
       }     
       else{
            horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
       }
    }
    
    /*
     * Constructor para dar la hora y minutos dados
     */
    public ClockDisplay(int hora, int minuto, boolean tipo)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(59);
        setTime(hora, minuto);
    }
    
    /*
     * Metodo dar hora actual
     */
        public String getTime()
    {
        return horaActual;
    }
    
    /*
     * Metodo poner hora fija sin devolver
     */
    public void setTime(int hora, int minuto)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);
        actualHoraDisplay();
    }
    
    /*
     * Metodo que incrementa los minutos y las horas si son necesarios
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