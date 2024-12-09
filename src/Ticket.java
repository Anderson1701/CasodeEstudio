public class Ticket {
    
    public String Placa;
    public float Tiempo_estacionado;
    public float Costo_total;
    private int N_ticket;
    private static int Count = 1;
    
    public Ticket(String Placa ){
        
        this.Placa = Placa;
    }
    
    public int getN_ticket() {
        return N_ticket;
    }

    private int Generar_tickets() {
        for (int i = 0; i < 1; i++) {
            Count++;
        }
        return Count-1;
    }
    
    public void setID() {
        this.N_ticket = Generar_tickets();
    }
    
    
    
    public void Mostrar_ticket(String placa, float Hora_de_entrada, float Hora_de_salida, float Calcular_tiempo, float Costo_total){
        System.out.println("Numero de ticket : " +N_ticket);
        System.out.println("placa:" +placa);
        System.out.println("Hora de entrada: " +Hora_de_entrada);
        System.out.println("Hora de salida:" +Hora_de_salida);
        System.out.println("Tiempo de estacionamiento: " +Calcular_tiempo);
        System.out.println("Valor a pagar: " +Costo_total);
    }
    
    public float Costo(float tiempo_estacionado, float Costo_por_hora){
        
        Costo_total= tiempo_estacionado * Costo_por_hora;
        return Costo_total;
    } 
}



