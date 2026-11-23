public class CajeroMenu {
     
    public void consultarSaldo(Saldo saldo){
            System.out.println("El saldo almacenado es:"+ saldo.getSaldo());
        
    }
    
    public void retirar(Saldo saldo){
       
            double montoRetiro= 600000;
            double totalSaldo= saldo.getSaldo()-montoRetiro;
            System.out.println("Retiro realizado, su saldo es de:"+totalSaldo);
        
    
    }
    
    public void Depositar(Saldo saldo){
            double consigna= 800000;
            double saldoTotal= saldo.getSaldo()+consigna;
            System.out.println("Consigna realizada, su saldo es de:"+saldoTotal);
           
        }
    
    public void verificarOpcion(Menu menu, CajeroMenu cajero , Saldo saldo){
        int opcionSeleccionada= menu.escogerOpcion();
                if(opcionSeleccionada== 1){
                   cajero.consultarSaldo(saldo);
                }else if(opcionSeleccionada==2){
                    cajero.retirar(saldo);
                }else if(opcionSeleccionada==3){
                    cajero.Depositar(saldo);
                }else{
                    System.out.println("Opcion no valida");
                }

    }
}
