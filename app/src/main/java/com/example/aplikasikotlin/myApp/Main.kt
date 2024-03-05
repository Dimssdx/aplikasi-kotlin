package com.example.aplikasikotlin.myApp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}
fun CreateAquarium() {
    val aquarium1 = UrAquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = UrAquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = UrAquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = UrAquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    val aquarium5 = UrAquarium(numberOfFish = 29)
    aquarium5.printSize()
    println("Volume: ${aquarium5.width * aquarium5.length * aquarium5.height / 1000} liters")
    val aquarium6 = UrAquarium(numberOfFish = 29)
        aquarium6.printSize()
        aquarium6.volumes = 70
        aquarium6.printSize()
}

fun main() {
    buildAquarium()
    CreateAquarium()
}