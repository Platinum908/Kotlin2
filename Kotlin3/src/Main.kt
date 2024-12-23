//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите нижнее основание трапеции: ")
    val lowerBase = readln().toInt()
    print("Введите верхнее основание трапеции: ")
    val upperBase = readln().toInt()

    val trapezoid = Trapezoid(lowerBase, upperBase)

    val semiSum = trapezoid.calculateSemiSum()
    println("Полусумма оснований трапеции: $semiSum")
}