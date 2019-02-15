package aquarium

open class Aquarium(var width: Int = 20, var height: Int = 40, val  length: Int = 100) {

    val area: Int
    get() = length * width * height

    fun volume() = width * height * length / 1000

    open var water = volume() * 0.9

    constructor(numberOfFish: Int): this(){
        val water: Int = numberOfFish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank(): Aquarium() {
    override var water = volume() * 0.8
}