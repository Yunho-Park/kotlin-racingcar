package race.domain

class RaceManager(cars: List<String>, val moves: Int) {
    val cars: SimpleCars

    init {
        this.cars = SimpleCars(cars)
    }

    fun move() {
        cars.moveAll()
    }
}
