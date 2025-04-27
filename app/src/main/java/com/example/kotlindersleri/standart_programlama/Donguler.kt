package com.example.kotlindersleri.standart_programlama

fun main() {
    //1,2,3
    for(i in 1..3) {  //Swift 1...3 i = index(Dizilerdeki indeks numara)
        println("Dongu 1 : $i")
    }

    //10 ile 20 arasında 5 er artsın

    for(x in 10..20 step 5) {  //Swift 1...3 i = index(Dizilerdeki indeks numara)
        println("Dongu 2 : $x")
    }
    for(y in 20 downTo 10 step 5) {  //Swift 1...3 i = index(Dizilerdeki indeks numara) downTo = geriye sayımı belirtir
        println("Dongu 3 : $y")
    }

    //1,2,3

    var sayac = 1

    while (sayac < 4 ) {
        println("Dongu 4 : $sayac")
        sayac+=1 // sayac = sayac +1
    }

    for(i in 1..5) {
        if(i == 3) {
            break    // döngüyü durdurur
        }
        println("Dongu 5 : $i")
    }

    for(i in 1..5) {
        if(i == 3) {
            continue    // bulunduğu adımı pas geçer
        }
        println("Dongu 6 : $i")
    }










}