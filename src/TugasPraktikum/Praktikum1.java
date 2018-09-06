/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Windows 10
 */
public class Praktikum1 {
    public static void main(String[] args) {
        //pengambilan fungsi main
        int a  =20; //deklarasi tipe data
        int b=4; //deklarasi tipe data
        try{
            int x  = a*b;
            System.out.println("Hasilnya: " + x); 
            int[] angka = {1, 2, 3, 4, 5,}; // array dengan 5 elemen
            angka[6] = 72; // mengakses indeks ke 24
            //int y = x/0;
        }catch (Exception e) {
            System.out.println("Salah");
            System.out.println(e); //blok jika terjadi kesalahan
        }finally    {
            System.out.println("Kesalahan Sudah selesai");
            
        }
        System.out.println("Selesai");

        }
}
