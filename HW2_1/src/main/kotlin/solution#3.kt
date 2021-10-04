fun main() {


    print("Please enter length: ")
    var length = readLine()?.toInt()
    print("Please enter width: ")
    var width = readLine()?.toInt()

    if (length != null && width != null) {
        var per = getPer(length, width)
        var ar = getArea(length, width)
        println("\nRectangle perimeter is $per")
        println("Rectangle Area is $ar\n")
        draw(length,width)
    }

}
    fun draw(num1:Int,num2:Int){
        num2?.let {
            for (i in 1..num2) {


                num1?.let {
                    for (i in 1..num1 - 1) {
                        print("* ")
                    }
                }
                println("* ")
            }
        }
    }

 fun getPer(num1:Int,num2:Int):Int = (2 * (num1 +num2))
 fun getArea(num1:Int,num2:Int):Int = (num1 *num2)
