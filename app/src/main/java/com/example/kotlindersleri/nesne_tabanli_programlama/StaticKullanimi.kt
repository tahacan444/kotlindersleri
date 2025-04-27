package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val a = ClassA()

    //standart nesne tabanlı erişim
//    println(a.x)
//    a.metod()


    //sanal nesne -Virtual Object - Nameless(İsimsiz) Object
//    println(ClassA().x)
//    ClassA().metod()


    //Static kullanımı    nesneye benzer erişim yapısı oluşur ama nesne değil değişken ve metotlar sınıf ismiyle direk erişilir işlm  yükünü azaltır
    println(ClassA.x)
    ClassA.metod()

}