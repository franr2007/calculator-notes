import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pon la nota del examen 1: ");
        double examen1=sc.nextInt();
        System.out.println("Pon la nota del examen 2: ");
        double examen2=sc.nextInt();
        System.out.println("Pon la nota del examen 3: ");
        double examen3=sc.nextInt();
        System.out.println("Pon la nota del examen 4: ");
        double examen4=sc.nextInt();

        //media
        double media=(examen1+examen2+examen3+examen4)/4;

        //Mostrar resultado
        if (media>=9) {
                System.out.println("Excelente: "+media);
        }
        else if (media<=8&&media >=7) {
                System.out.println("notable: "+media);
        }
        else if (media>=6) {
                System.out.println("bé: "+media);
        }
        else if (media>=5) {
                System.out.println("suficiente: "+media);
        }
        else{
                System.out.println("suspendido: "+media);
        }

        sc.close();
    }
}
