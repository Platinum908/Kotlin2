fun twins(n: Int) {
    if (n <= 2) {
        println("Введите натуральное число больше 2")
        return
    }
    for (i in n until 2 * n - 1) {
        println("Пара близнецов: ($i, ${i + 2})")
    }
}

fun main() {
    print("Введите натуральное число больше 2: ")
    val n = readLine()?.toIntOrNull() ?: 0
    twins(n)
}