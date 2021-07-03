package solucionandodesafios

/**
 * Desafio:
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
 * Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
 *
 * _Perimetro = XX.X_
 *
 * Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
 *
 * _Area = XX.X_
 *
 * Entrada:
 * A entrada contém três valores reais.
 *
 * Saída:
 * O resultado deve ser apresentado com uma casa decimal.
 */
fun main() {

    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')

    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }

    // insira as variáveis de acordo com o calculo do perímetro e area
    val p = (a + b + c).format(1)

    val r = ( ( ( a + b ) *  c  / 2 ) ).format(1)

    if (c < (a + b) && b < (a + c) && a < ( b + c ))
        println("Perimetro = $p")
    else
        println("Area = $r")

}