package com.example.kotlindersleri.odevler

import android.text.method.KeyListener

class Odev21Class {

    fun dereceDonusum(derece:Int): Double {
        val donusum = derece *1.8 +32
        return donusum
    }

    fun cevreHesapla(k1:Int,k2:Int): Int {
        val hesapla = 2 *( k1 + k2)
        return hesapla
    }

    fun faktoriyelHesapla(sayi:Int):Int {
        var faktoriyel = 1
        for(i in 1 ..sayi){
            faktoriyel *= i
        }
        return  faktoriyel

    }
    fun harfBul(kelime:String,harf:Char): Int {
        var sayac = 0
        for(i in kelime) {
            if(i  == harf)
                sayac++
        }
         return  sayac
    }

}


