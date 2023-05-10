public class Ejercicio1 {

    // Primera parte
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma( 6, 2, 10);
        System.out.println(resultado);

    // Segunda parte

        coche micoche = new coche();
        micoche.agregaruertas();
        System.out.println(micoche.puertas);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }

        }
class coche {
    public int puertas = 4;
    public void agregaruertas(){
        this.puertas++;
    }
}
