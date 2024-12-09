public class Vehiculos {
    
    public String Placa;
    public float Hora_de_entrada;
    public float Hora_de_salida;
    
    public Vehiculos(String Placa,float Hora_de_entrada,float Hora_de_salida){
        
        this.Placa = Placa;
        this.Hora_de_entrada = Hora_de_entrada;
        this.Hora_de_salida = Hora_de_salida;
    }
    
    public void Registrar_entrada(){
        
        System.out.println("Registrando hora de entrada " );
        System.out.println("La hora de entrada es: " + Hora_de_entrada);
    }
    
    public void Registrar_salida(){
        
        System.out.println("Registrando hora de salida " );
        System.out.println("La hora de salida es: " + Hora_de_salida);
    }
    
    public float Calcular_tiempo(){
        
        float tiempo_total;
        tiempo_total= Hora_de_salida - Hora_de_entrada;
        
        return tiempo_total;
    }  
}