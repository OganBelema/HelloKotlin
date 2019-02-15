package aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val aquarium = Aquarium()

    println("Length: ${aquarium.length} Height: ${aquarium.height} Width: ${aquarium.width}")

    aquarium.width = 60

    println("New width: ${aquarium.width}")

    println("The area is ${aquarium.area}")

    println("The volume is ${aquarium.volume()} litres ")

    val aquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${aquarium2.volume()} litres with length ${aquarium2.length} width ${aquarium2.width}"+
    " height ${aquarium2.height}")
}

fun feedFish(fish: FishAction){
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}
