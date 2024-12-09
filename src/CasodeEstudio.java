public class CasodeEstudio {

    public static void main(String[] args) {
        Vehiculos vehiculo1= new Vehiculos ("PCH-1940",2.50f,3.50f);
        vehiculo1.Registrar_entrada();
        vehiculo1.Registrar_salida();
        float tiempo1 = vehiculo1.Calcular_tiempo();
        
        Parqueadero parqueadero1 = new Parqueadero (2.50f);
        parqueadero1.Registrar_vehiculos();
        parqueadero1.Procesar_salida();
        
        
        Ticket ticket1 = new Ticket("PCH-1940");
        float Costo1= ticket1.Costo(tiempo1, 2.50f);
        ticket1.Mostrar_ticket("PCH-1940",2.50f ,3.50f,tiempo1, Costo1);
        
        System.out.println("===============================================================");
        
        Vehiculos vehiculo2= new Vehiculos ("PCH-1948",2.50f,5.50f);
        vehiculo2.Registrar_entrada();
        vehiculo2.Registrar_salida();
        float tiempo2 = vehiculo2.Calcular_tiempo();
        
        Parqueadero parqueadero2 = new Parqueadero (2.50f);
        parqueadero2.Registrar_vehiculos();
        parqueadero1.Procesar_salida();
        
        Ticket ticket2 = new Ticket("PCH-1940");
        float Costo2= ticket2.Costo(tiempo2, 2.50f);
        ticket1.Mostrar_ticket("PCH-1940",2.50f ,3.50f,tiempo2, Costo2);
        
    }
    
}