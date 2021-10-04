fun main() {
    var car_1 = Car(2020)

    car_1.apply {
        model = "toyota  "
        year = 2020
    }
    println(car_1.model + car_1.year)
}

class Car(year: Int) {
    lateinit var model: String

    var year: Int? = null

}
