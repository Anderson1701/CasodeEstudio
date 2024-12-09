public class Parqueadero {
    
    public float Tarifa_por_hora;
    public String Historial_vehiculo;
    public String Historial_tickets;
    
    public Parqueadero(float Tarifa_por_hora){
        
        this.Tarifa_por_hora = Tarifa_por_hora;
        
    }
    
    public void Registrar_vehiculos(){
        
        System.out.println("Registrando Vehiculo " );
        
    }
    
    public void Procesar_salida(){
        System.out.println("Registrando salida de Vehiculo " );
        
    }
    
    public void Obtener_historial(){
        System.out.println("Obteniendo Historial .... " );
        
    }
}