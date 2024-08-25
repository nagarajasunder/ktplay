import java.util.*
import kotlin.math.ceil
import kotlin.math.log10
import kotlin.math.pow

data class PieItem(
    val name:String,
    val value:Float
)

fun main() {
    val pieItems = listOf(
        PieItem("Kotlin",70f),
        PieItem("Java",40f),
        PieItem("Python",80f),
        PieItem("C++",20f),
        PieItem("Rust",15f)
    )

    val pieFactor = getPieFactor(pieItems)
    println(pieFactor)
    var startAngle = 0f
    pieItems.forEach {pieItem ->
        val sweepAngle = startAngle+(pieItem.value*pieFactor)
        println("For item ${pieItem.value} Start ${startAngle} Sweep ${sweepAngle}")
        startAngle+=(pieItem.value*pieFactor)

    }
}

fun getPieFactor(pieItems: List<PieItem>) : Float {
    val sum = pieItems.sumOf { it.value.toDouble() }.toFloat()
    return 360f/sum
}