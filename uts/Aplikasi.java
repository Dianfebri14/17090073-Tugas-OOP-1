import java.util.LinkedList;
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static InventarisMobil service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new InventarisMobil();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n");
        System.out.println("APLIKASI INVENTARIS MOBIL");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan data");
        System.out.println("-----------");
        System.out.println("0. KELUAR");
        System.out.println("\n");
        System.out.print("Pilihan > ");
    }

    private static void modulAdd() {
        String nomor, merek, harga, tanggal_pembelian, tahun_keluaran, type, bahan_bakar;

        System.out.println("--- tambah data ---");
        System.out.print("NOMOR : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        System.out.print("Merek : ");
        merek = scanner.nextLine();
        System.out.print("Harga : ");
        harga = scanner.nextLine();
        System.out.print("Tanggal Pembelian : ");
        tanggal_pembelian = scanner.nextLine();
        System.out.print("Tahun Keluaran : ");
        tahun_keluaran = scanner.nextLine();
        System.out.print("Type : ");
        type = scanner.nextLine();
        System.out.print("Bahan Bakar : ");
        bahan_bakar = scanner.nextLine();
        service.addData(new Mobil(nomor, merek, harga, tanggal_pembelian, tahun_keluaran, type, bahan_bakar));
    }

    private static void tampilData() {
        LinkedList<Mobil> result = (LinkedList<Mobil>) service.getAllData();

        int i=1;
        for(Mobil mbl : result) {
            System.out.println("data ke-" + i++);
            System.out.println("  nomor: " + mbl.getNomor());
            System.out.println("  merek: " + mbl.getMerek());
            System.out.println("  harga: " + mbl.getHarga());
            System.out.println("  tanggal pembelian: " + mbl.getTanggal_pembelian());
            System.out.println("  tahun keluaran: " + mbl.getTahun_keluaran());
            System.out.println("  type: " + mbl.getType());
            System.out.println("  bahan bakar: " + mbl.getBahan_bakar());
        }
    }

    private static void ubahData() {
        String nomor, merek, harga, tanggal_pembelian, tahun_keluaran, type, bahan_bakar;

        System.out.println("--- perubahan data ---");
        System.out.print("NOMOR : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        System.out.print("Merek : ");
        merek = scanner.nextLine();
        System.out.print("Harga : ");
        harga = scanner.nextLine();
        System.out.print("Tanggal Pembelian : ");
        tanggal_pembelian = scanner.nextLine();
        System.out.print("Tahun Keluaran : ");
        tahun_keluaran = scanner.nextLine();
        System.out.print("Type : ");
        type = scanner.nextLine();
        System.out.print("Bahan Bakar : ");
        bahan_bakar = scanner.nextLine();
        service.updateData(new Mobil(nomor, merek, harga, tanggal_pembelian, tahun_keluaran, type, bahan_bakar));
    }

    private static void hapusData() {
        String nomor;

        System.out.println("--- hapus data ---");
        System.out.print("NOMOR : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        service.deleteData(new Mobil(nomor, null, null, null, null, null, null));
    }

}