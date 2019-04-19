package service;

import java.util.LinkedList;
import java.util.List;

import model.Mobil;

public class InventarisMobil {

    private static List<Mobil> data = new LinkedList<>();

    public void addData(Mobil mbl) {
        data.add(mbl);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Mobil mbl) {
        int result = data.indexOf(mbl);
        
        if(result >= 0) {
            data.set(result, mbl);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }
    }

    public void deleteData(Mobil mbl) {
        int result = data.indexOf(mbl);

        if(result >= 0) {
            data.remove(result);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }
    }

    public List<Mobil> getAllData() {
        return data;
    }

}