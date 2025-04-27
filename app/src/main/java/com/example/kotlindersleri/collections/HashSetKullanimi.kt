package com.example.kotlindersleri.collections

fun main() {
    //HASHSET
    //Tanımlama
    val meyveler = HashSet<String>()
    //Any -> en üst sınıf demek
    //Bütün türleri kapsar
    //Java -> Object

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)

    meyveler.add("Amasya Elma")
    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)

    println("Boyut : ${meyveler.size}")

    for(meyve in meyveler) {
        println("Sonuc : $meyve")
    }

    for((index,meyve) in meyveler.withIndex()) {  //Swift : enumareted()
        println("$index. -> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)





}