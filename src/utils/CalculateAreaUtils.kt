package utils

import kotlin.math.pow

object CalculateAreaUtils : CalculateAreaContract {
    override fun calculateAreaRectangle(length: Int, width: Int): Int {
        return length * width
    }

    override fun calculateAreaCircle(radius: Int): Double {
        return 3.14 * radius.toDouble().pow(2)
    }

    override fun calculateAreaTriangle(base: Int, height: Int): Double {
        return 0.5 * base * height
    }
}