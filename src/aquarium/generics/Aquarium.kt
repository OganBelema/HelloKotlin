package aquarium.generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true){

    fun addChemicalCleaners(){
        needsProcessed = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true){

    fun filter(){
        needsProcessed = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T){

    fun addWater(cleaner: Cleaner<T>){
        if(waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }

        println("adding water from $waterSupply")
    }
}

interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun genericExample() {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

    val cleaner = TapWaterCleaner()
    aquarium.addWater(cleaner)
}