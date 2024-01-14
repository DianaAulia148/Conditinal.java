import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int x = S.nextInt();
        if (x > 0) {
            System.out.println(x + " Adalah Bilangan Positif");
        } else {
            if (x < 0) {
                System.out.println(x + " Adalah Bilangan Negatif");
            } else {
                System.out.println(x + " Adalah Angka Nol");
            }
        }

        //Latihan : Tambahkan Statement untuk program di bawah ini
        // agar dapat mencetak hasil di layar monitor
        Scanner KB = new Scanner(System.in);
        String dayString1, dayString2, dayString3;
        System.out.println("Masukan kode hari (1 / 2 / 3 / 4 / 5 )= ");
        int day = KB.nextInt();
        switch (day) {
            case 1:
                dayString1 = "Saturday";
            case 2:
                dayString2 = "Sunday";
                break;
            case 3:
                dayString3 = "Monday";
                break;
            case 4:
                dayString1 = "Tuesday";
            case 5:
                dayString2 = "Wednesday";
                break;
            default:
                dayString3 = "invalid day";
                break;
        }
    }
}
