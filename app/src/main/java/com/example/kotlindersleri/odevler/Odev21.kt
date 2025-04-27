package com.example.kotlindersleri.odevler

fun main() {
    val odev =  Odev21Class()

    var fahrenhiet =  odev.dereceDonusum(10)   // 1  Celciusu Fahrenhieta döüştüren kod
    println("Fahrenayt : $fahrenhiet")

    val cevre = odev.cevreHesapla(10,20)
    println("Cevre : $cevre")

     val fkHesap = odev.faktoriyelHesapla(6)
    println("Faktoriyel : $fkHesap")

    val harf = 'T'
    val sonuc = odev.harfBul("Taha", harf)
    println("$harf harfi $sonuc tane var.")
}

