package com.example.kotlindersleri.nesne_tabanli_programlama

import com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.Hayvan
import com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.Kedi
import com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.Kopek
import com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.Memeli

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()  // kalıtım yok kendi metoduna erişti
    memeli.sesCikar() // kalıtım var bir üst sınıfın metoduna erişti
    kedi.sesCikar() // kalıtım var ,kendi metoduna erişti
    kopek.sesCikar() //kalıtım var,kendi metoduna erişti
}