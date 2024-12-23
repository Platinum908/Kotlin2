fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Изначальный список: $list")

    print("Введите индекс k: ")
    val k = readlnOrNull()?.toIntOrNull() ?: return

    for (i in k ..< list.size - 1) {
        list[i] = list[i + 1]
    }

    list.removeAt(list.size - 1)

    println("Обновленный список: $list")

    mainDiff()
}

fun diff(set1: Set<Int>, set2: Set<Int>, set3: Set<Int>): Set<Int> {
    return set1 - set2 - set3
}

fun mainDiff() {
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(3, 4)
    val set3 = setOf(5)

    val result = diff(set1, set2, set3)
    println("Результат разности множеств: $result")
}
