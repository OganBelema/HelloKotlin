package aquarium

abstract class AquariumFish {
    abstract val color: String
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor{
    override val color = "gold"
}

class Shark: AquariumFish(), FishAction {
    override val color = "grey"

    override fun eat() {
        println("hunt and eat fish")
    }
}

class AlternateShark: FishAction, FishColor by GoldColor {
    override fun eat() {

    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"

    override fun eat() {
        println("munch on algae")
    }
}

interface FishAction {
    fun eat()
}