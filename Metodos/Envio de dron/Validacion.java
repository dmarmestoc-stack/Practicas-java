public class Validacion {
    
    public boolean validarBateria(Dron dron){
        boolean estaDisponible;
        //Porcentaje de bateria minimo: 50//
        if(dron.getBateria()>=50){
          estaDisponible= true;
           
        }else{
         estaDisponible=false;
          
        }  
       return estaDisponible;
    }
    
    public boolean validarVelocidad(Dron dron){
        boolean esSeguro;
        //Velocidad max de viento: 30//
        if(dron.getVelocidadViento()<=30){
            esSeguro= true;
        }else{
            esSeguro=false;
        }
        
     return esSeguro;   
    }
    
    public boolean validarPeso(Dron dron){
        boolean esPesado;
        //Peso maximo : 10//
        if(dron.getPeso()>10){
            esPesado= true;
        }else{
            esPesado=false;
        }
        
        return esPesado;
    }
    
    public void validarEnvio(Dron dron){
        boolean sePuedeEnviar;
        if(validarPeso(dron) && validarVelocidad(dron) && validarBateria(dron)){
            System.out.println("El envio se puede realizar");
            
        }else{
            System.out.println("El envio no se puede realizar");
            
        }
        
        
    }
}
