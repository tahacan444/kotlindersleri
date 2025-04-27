package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nullable,Null Safety,Optional(Swift)
    //Genellikle mobil uygulama geliştirme dillerinde yer alır
     //null,Nan,nil
    //1.Tanımlama
    var mesaj:String? = "MERHABA"

   // mesaj = "Merhaba"

    //Yontem 1
    //Sorun yoksa çalışır sorun varsa uygulama çökmez
    println("Yontem 1 : ${mesaj?.uppercase()}")

    val x = mesaj?.uppercase()
    //x.lowercase()

    //Yontem 2
    //Sorun yoksa çalışır,sorun varsa uygulama çöker
    //Çok emin oluınan kodlara kullanılabilir
//    println("Yontem 2 : ${mesaj!!.uppercase()}" )  // null olmayacağına garanti verir

    //Yontem 3
    //null kontorlu

    if(mesaj != null) {
        println("Yontem 3 : ${mesaj.uppercase()}")
    }
    else {
        println("Degiskende null yer almaktadir")
    }
    //null kontrol

    mesaj?.let{
        println("Yontem 3 : ${mesaj.uppercase()}")
    }
}