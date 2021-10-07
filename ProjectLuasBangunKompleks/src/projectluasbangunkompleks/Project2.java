/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author AVITA
 */
public class Project2 {
    public static void main(String[] args){
        Lingkaran l2 = new Lingkaran();
        l2.r = 14;
        double lingkaran = l2.hitungLuas() / 2;
        
        Lingkaran l3 = new Lingkaran();
        l3.r = 7;
        double lingkaran2 = l3.hitungLuas();
        
        double luasBangun = lingkaran - lingkaran2;
        System.out.println("Luas daerah yang berwarna abu-abu adalah :" + luasBangun);
    }
}
