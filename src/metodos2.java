import java.util.Scanner;//yeveirnp
import java.util.InputMismatchException;
import com.sun.source.util.SourcePositions;

public class metodos2 { //clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Paciente a = new Paciente();
        Scanner t = new Scanner(System.in);
        String nomPaciente;
        int peso;
        int estatura;

        System.out.println("Ingrese el nombre del Paciente");
        nomPaciente = t.nextLine();
        System.out.println("Ingresa el peso del Paciente");
        try {
            peso = t.nextInt();

        }catch (InputMismatchException kaboom)
        {
            System.out.println("Valor no valido para edad");
        }
        System.out.println("Ingresa la estatura del Paciente");
        try {
            estatura = t.nextInt();

        }catch (InputMismatchException kaboom)
        {
            System.out.println("Valor no valido para edad");
        }

        String diagnostico = calcularIMC(peso,estatura);//calularemos el diagnosticos con el calcularIMC conlos datos pedidos
        System.out.println("Su diagnóstico es: " + diagnostico);
        scanner.close();
    }

    public static String calcularIMC(double peso, double altura) { //sera el metodo para hacer un diagnostico
        double imc = peso / (altura * altura);
        if (imc < 18.5) { //puse un if y else para cada valor ya sea mayor, menor o igual q regrese la leyende correspondiente
            return "bajo peso pana";
        } else if (imc >= 18.5 && imc < 25) {
            return "pesas normal sigue así cawn";
        } else if (imc >= 25 && imc < 30) {
            return "sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "obesidad t1";
        } else if (imc >= 35 && imc < 40) {
            return "obesidad t2";
        } else {
            return "obesidad t3";
        }
    }
}
