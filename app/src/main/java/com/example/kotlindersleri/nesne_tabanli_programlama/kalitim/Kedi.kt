package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

class Kedi:Memeli() {
    override fun sesCikar() {
        //super.sesCikar()  // super : Kalıtım ile üst sınıfı temsil eder
        println("Miyav miyav")

    }
}