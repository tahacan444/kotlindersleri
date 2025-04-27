package com.example.kotlindersleri.odevler

class Odev22Class {

    fun icAciBul(kenar:Int): Int {
        return (kenar -2) *180

    }

    fun maasHesap(gunSayisi:Int):Int {
        val  calismaSaatUcreti = 10
        val mesaiUcreti = 20
        val gunlukSaat = 8
        val toplamSaat = gunSayisi*gunlukSaat

        return if(toplamSaat <= 160 ) {
            toplamSaat*calismaSaatUcreti
        } else {
            val normalSaat = 160
            val mesaiSaat = toplamSaat - normalSaat
            (normalSaat * calismaSaatUcreti) + (mesaiSaat * mesaiUcreti)
        }

    }

    fun kotaHesapla(kota:Int): Int {

        val standartKota = 50
        val standartUcret = 100
        val asimUcreti = 4

        return  if (  kota <= standartKota) {
            standartUcret
        }
        else{
             val asimMiktar = kota - standartKota
              standartUcret + (asimMiktar * asimUcreti)
        }



    }



}