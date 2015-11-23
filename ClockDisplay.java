

/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
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
    //Atributo booleano para elejir tipo de reloj Ordenador o defecto
    private boolean calOrds;
    //Los años asignar o hay
    private NumberDisplay años;
     //Los meses asignar o hay
    private NumberDisplay meses;
    //Los dias asignar o hay
    private NumberDisplay dias;
    
    
    
    /*
     * Constructor que inicializa a oo:oo
     * Escribe true para elejir reloj del ordenador y false para el de por defecto
     */
    public ClockDisplay(boolean tipo, boolean calOrd )
    {
        calOrds = calOrd;
        if (calOrd == true) {
            Calendar c1 = GregorianCalendar.getInstance();
            System.out.println("Fecha actual: "+c1.getTime().toLocaleString());
        }
        else{
            horas = new NumberDisplay(24);//Con esto creamos un nuevo objeto de la clase NumberDisplay
            minutos = new NumberDisplay(59);//Con esto creamos un nuevo objeto de la clase NumberDisplay
            dias = new NumberDisplay(30);
            meses = new NumberDisplay(12);
            años = new NumberDisplay(99);
            actualHoraDisplay();
            tipos = tipo;
        }
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
                horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " AM" + " Cal " + dias.getDisplayValue() + "/" + meses.getDisplayValue() + "/" + años.getDisplayValue();
            }
       }     
       else{
            horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ " Cal " + dias.getDisplayValue() + "/" + meses.getDisplayValue() + "/" + años.getDisplayValue();
       }
    }
    
    /*
     * Constructor para dar la hora  minutos  dia mes y año
     * Escribe true para formato 12 o false para formato 24
     * 
     */
    public ClockDisplay(int hora, int minuto, int dia, int mes, int año, boolean tipo)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(59);
        dias = new NumberDisplay(30);
        meses = new NumberDisplay(12);
        años = new NumberDisplay(99);
        setTime(hora, minuto,dia,mes,año);
    }
    
    /*
     * Metodo dar hora actual
     */
        public String getTime()
    {
        return horaActual;
    }
    
    /*
     * Metodo poner hora dia mes y año fija sin devolver
     */
    public void setTime(int hora, int minuto, int dia, int mes, int año)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);
        dias.setValue(dia);
        meses.setValue(mes);
        años.setValue(año);
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