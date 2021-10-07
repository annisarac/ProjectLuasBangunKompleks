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
public class Project1 {
    public static void main(String[] args){
        //PROJECT 1
        Lingkaran l = new Lingkaran();
        l.r = 21;
        double LuasLingkaran = l.hitungLuas() * 2;
        
        Persegi p = new Persegi();
        p.s = 42;
        int LuasPersegi = p.hitungLuas();
        
        double TotalLuas = LuasLingkaran + LuasPersegi;
        System.out.println("Luas Bangun tersebut adalah :" + TotalLuas);
        
        //PROJECT2
        
    }
}
