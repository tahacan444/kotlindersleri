package com.example.kotlindersleri.collections

fun main() {
    //HashMap JSON veri modeline benzemektedir.
    //Map.Didctionary(Swift)
    //Shared Preferences,Datastore,UserDefault(Swift)
    val iller =  HashMap<Int,String> ()

    iller.put(16,"BURSA")
    iller[34] = "ISTANBUL"
    iller[6] = "ANKARA"

    println(iller)

    iller[16] ="YENI BURSA"
    println(iller)

    var il = iller[6]
    println(il)

    println("Boyut : ${iller.size}")

    for ((anahtar,deger) in iller) {
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)
}