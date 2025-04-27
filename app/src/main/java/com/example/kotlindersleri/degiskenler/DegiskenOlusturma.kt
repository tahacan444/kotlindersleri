package com.example.kotlindersleri.degiskenler

fun main() {
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan  =4.7
    var fiyat = 4500
    var stokDurum =true

    println("Id : $id")
    println("Ad $ad")
    println("Resim $resim")
    println("Puan $puan")
    println("Fiyat $fiyat")
    println("Stok Durum :$stokDurum")

    //Sabitler - Constant
    // değişken tanımladğığımzda değişmeyen değişkenler

    var sayi = 30
    sayi = 100

    println(sayi)

    val numara = 50   //val sabit demek  değişmeyen  performansa faydası var
    //var = dinamik val = statik
    println(numara)


    var f = 10
    println(f)
    f = 40
    

    //Tür Dönüşümü
    //1- Sayısaldan Sayısala Dönüşüm
    val d = 89.56
    val sonuc1 = d.toInt()  //Yuvarlama yok sadece noktadan sonrasını siler matematiksel anlamda tehlikeli olabilir.
    println(sonuc1)

    val i = 34
    val sonuc2 =i.toDouble()
    println(sonuc2)

    //2 sayısaldan metine dönüştürme
    var x = 85
    val sonuc3 = x.toString()//"85"
    println(sonuc3)

    //3  Metinden sayısala dönüşüm
    val yazi = "48T"
    val sonuc4 = yazi.toIntOrNull()


    if (sonuc4 != null) {
        println(sonuc4)
    }
    else{
        println("Sonuc nulldur ")
    }


}
