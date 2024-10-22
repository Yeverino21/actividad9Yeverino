import java.util.Scanner; //yeverino
public class metodos1 { //mi clase es metodos1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        for (int i = 1; i <= 20; i++) { //el metodo ayudara a pedir la clif e ir pidiendo una tras otras hasta llegar a 20 o menos
            System.out.print("Ingrese la calificación " + i + ": "); //vamos a pedir las calificaciones
            double calificacion = scanner.nextDouble();
            suma += calificacion;
        }
        double promedio = calculaPromedio(suma); //usaremos un double para calcular el promedio mendiante las calificaciones
        System.out.println("El promedio de las calificaciones es: " + promedio);// nos va mostrar el promedio

        if (esAprobado(promedio)) { //usaremos un if y else para saber si sera aprobado o rebronado
            System.out.println("El promedio fue aprobado.");
        } else {
            System.out.println("El promedio fue reprobado.");
        }
        scanner.close();
    }
//hize los metodos para calucluar el promedio y saber si es aprobado
    public static double calculaPromedio(double suma) {
        return suma / 20;
    }
    public static boolean esAprobado(double calificacion) {
        return calificacion > 80 && calificacion <= 100;
    }
}
