import java.util.Scanner;
public class Resuelto13 {
    public static void main(String[] args){
        int nota1, nota2, nota3;
        int mediaBoletin;
        double mediaExpediente;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.print("Nota segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.print("Nota tercer trimestre: ");
        nota3 = sc.nextInt();
        mediaExpediente = (nota1 + nota2 + nota3) / 3;
        mediaBoletin = (int) mediaExpediente;
        System.out.println("Boletín calificaciones: " + mediaBoletin);
        System.out.println("Expediente académico " + mediaExpediente);

    }
}
