package com.example.kotlindersleri.odevler

fun main() {
    val odev2 =  Odev22Class()

    var icAciToplamı = odev2.icAciBul(5)
    println("ic aci toplami : $icAciToplamı")

    val gunSayisi = 2
    val maas = odev2.maasHesap(gunSayisi)
    println("$gunSayisi gun calisinca maas: $maas ")

    val kota = 60
    val kotaUcreti = odev2.kotaHesapla(kota)
    println("$kota GB icin ucret: $kotaUcreti ")
}

