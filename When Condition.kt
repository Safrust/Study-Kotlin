fun main() {
    var day = 3

    var result = when (day) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        else -> "Minggu"
    }
    println(result)
}
