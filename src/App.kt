import utils.CalculateAreaContract
import utils.CalculateAreaUtils

class App {
    //define dulu sebelum dipanggil
    private lateinit var calculateAreaUtils: CalculateAreaUtils

    companion object{
        @JvmStatic
        fun main(args :Array<String>){
            App().start()
        }
    }

    fun start(){
        calculateAreaUtils = CalculateAreaUtils
        printHeader()
        readLine()?.let {
            openMenu(it)
        }
    }

    //bikin header
    fun printHeader(){
        println("""
            ======================================
            Console app for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle Area 
            2. Calculate Circle Area
            3. Calculate Triangle Area
            ======================================
            Enter menu? (1/2/3)
            ======================================
        """.trimIndent())
    }

    fun openMenu(menu: String) {


        when(menu){
            "1" -> {
                openMenuRectangle()

            }
            "2" -> {
                openMenuCircle()

            }
            "3" -> {
                openMenuTriangle()
            }
            else -> {
                println("No menu matches")
                start()
            }
        }
    }

    private fun openMenuRectangle(){
        //?: 0 -> elvis operator
        println("Enter Length = ")
        var length = readLine()?.toInt() ?: 0
        println("Enter Width = ")
        var width = readLine()?.toInt() ?: 0
        println("Area of Rectangle is = ${calculateAreaUtils.calculateAreaRectangle(length,width)}")
    }

    private fun openMenuCircle(){
        println("Enter Radius")
        var radius = readLine()?.toInt() ?: 0
        println("Area of Circle is = ${calculateAreaUtils.calculateAreaCircle(radius)}")
    }

    private fun openMenuTriangle(){
        println("Enter Base = ")
        var base = readLine()?.toInt() ?:0
        println("Enter Height = ")
        var height = readLine()?.toInt() ?:0
        println("Area of Triangle is = ${calculateAreaUtils.calculateAreaTriangle(base, height)}")
    }
}