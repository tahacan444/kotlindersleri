package com.example.kotlindersleri.nesne_tabanli_programlama

class ClassB : MyInterface{
    override var degisken: Int = 100

    override fun metod1() {
        println("Metot 1 calisti")
    }

    override fun metod2(): String {
        return "Metot 2 calisti"
    }

}