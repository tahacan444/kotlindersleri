fun main() {

    //Tanımlama
    val meyveler = ArrayList<String>()

    //Veri ekleme : en sonuna ekler
    meyveler.add("Elma") //0
    meyveler.add("Muz") //1
    meyveler.add("Kiraz") //2

    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    // Insert: istediğiniz bir indekse
    meyveler.add(1,"Portakal")
    println(meyveler)

    val m = meyveler.get(3)
    println(m)
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")

    meyveler.reverse()
    println(meyveler)

    for(meyve in meyveler) {
        println("Sonuc : $meyve")
    }

    for((index,meyve) in meyveler.withIndex()) {  //Swift : enumareted()
        println("$index. -> $meyve")
    }

    //Silme
    meyveler.removeAt(1)
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}