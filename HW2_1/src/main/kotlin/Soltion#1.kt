fun main() {
    var car_1 = Car(2020)

    car_1.apply {
        model = "toyota  "
    }
    println(car_1.model + car_1.year)
}

class Car(var year: Int) {
    lateinit var model: String



}
