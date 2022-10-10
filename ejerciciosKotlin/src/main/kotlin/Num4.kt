fun main() {
    val kardex: Map<String, Int> = mapOf(
        "Matemáticas" to 65, "Física" to 50, "Química" to 34,
        "Economía" to 82, "Historia" to 97, "Programación" to 10
    )
    println(calif(kardex))

}

fun calif(notas: Map<String, Int>): Map<String, String> {
    val des: MutableMap<String, String> = mutableMapOf()
    for ((k, v) in notas) {
        val d = when (v) {
            in 0..69 -> "Desempeño insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        des[k.uppercase()] = d
    }
    return des
}