package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 17

    println( yas >= 18)

    if( yas >= 18){     // parantezin içindeki ifade koşulu sağlıyorsa if çalışır

        println("Resitsiniz")
    }
    else {                      //koşul sağlanmazsa if çalışmaz else çalışır
        println("Resit Degilsiniz")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 11

    if (ka == "admin" && s == 123456){  // && == And(ve) true && true ise true olur diğer durumlarda false olur
        println("Hosgeldiniz")
    }
    else{
        println("Hatali Giris")
    }

    if(sayi == 9 || sayi == 10){ //   || == or(veya),false || false ise false olur,diger durumlarda turu olur.
       println("Sayi 9 veya 10 dur")
    }
    else{
        println("Sayi 9 veya 10 degildir")
    }

    //when,Diğer dillerde Switch olarak bilinir

    val number = 5

    when(number) {
        1 ->  {

            println("Sayi 1'dir")
        }
        2 -> println("Sayi 2'dir")
        else -> println("Tanimlanmayan sayi")
    }
}