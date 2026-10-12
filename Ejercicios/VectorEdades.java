public class VectorEdades {
    public static void main(String[] args) {
      int edades[]= {17,18,16,20,21,25,19};
    int contador=0;
int cont=0;
int suma=0;
double promedio=0;
int size= edades.length;
System.out.println("Size: "+size);
for(int edad:edades){
    System.out.println("Edad:"+edad);
    suma=suma+edad;
    if(edad<MAYOR_EDAD){
        contador=conador+1;

    }
   cont++;

}
System.out.println("Hay "+contador+" menores de edad");
System.out.println("Suma:"+suma);
proemedio=suma/cont;
System.out.println("Promedio:"+promedio);
}
 }
