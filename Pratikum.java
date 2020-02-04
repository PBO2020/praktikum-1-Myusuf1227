
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;

public class Pratikum {

    ArrayList<pratikumclas> ucup = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

    String NIK, Nama, TTL, Jeniskelamin;
    int Goldarah;

    public static void main(String[] args) {
        Pratikum cup = new Pratikum();
        cup.menu();
    }

    public void menu() {
        int pilih = 0;
        do {
            System.out.println("___________________");
            System.out.println(" [1]Inputkan Data");
            System.out.println(" [2]Tampil Data");
            System.out.println(" [3]Keluar");
            System.out.println("___________________");
            System.out.println(" Silahkan Pilih Menu Kamu :   ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    InputkanData();
                    break;
                case 2:
                    TampilanData();
                    break;
                case 3:
                    System.out.println("Anda Berhasil Keluar");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan Anda Salah");
            }
        } while (pilih != 5);

    }

    void InputkanData() {
        System.out.print("NIK            : ");
        String uva = input.nextLine();
        NIK = input.nextLine();
        System.out.print("Nama           : ");
        Nama = input.nextLine();
        System.out.print("TTL            : ");
        TTL = input.nextLine();
        System.out.print("Jenis Kelamin  : ");
        Jeniskelamin = input.nextLine();
        System.out.print("Golangan Darah : ");
        Goldarah = input.nextInt();

        pratikumclas p = new pratikumclas(NIK, Nama, TTL, Jeniskelamin, Goldarah);
        ucup.add(p);

    }

    void TampilanData() {
        if (ucup.isEmpty() == true) {
            System.out.println("Data kosong silahkan input kembali ^^");
            menu();
        } else {

            for (int i = 0; i < ucup.size(); i++) {
                System.out.println("\nNIK                   : " + ucup.get(i).getNIK());
                System.out.println("Nama                  : " + ucup.get(i).getNama());
                System.out.println("Tempat, tanggal lahir : " + ucup.get(i).getTTL());
                System.out.println("Jenis kelamin         : " + ucup.get(i).getJeniskelamin());
                if (ucup.get(i).getGoldarah() == 1) {
                    System.out.println("Golongan darah        : A");
                } else if (ucup.get(i).getGoldarah() == 2) {
                    System.out.println("Golongan darah        : B");
                } else if (ucup.get(i).getGoldarah() == 3) {
                    System.out.println("Golongan darah        : AB");
                } else if (ucup.get(i).getGoldarah() == 4) {
                    System.out.println("Golongan darah        : O");
                }
            }
            menu();
        }
    }
}
