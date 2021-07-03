package solucionandodesafios

/**
 * Desafio:
 * Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares,
 * quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores
 * informados são negativos.
 *
 * Entrada:
 * Você receberá 5 valores inteiros.
 *
 * Saída:
 * Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo
 * o final de linha após cada uma.
 */
fun main() {

    val inteiros = mutableListOf<Int>()
    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()
    val positivos = mutableListOf<Int>()
    val negativos = mutableListOf<Int>()

    for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }
    for (i in inteiros) { if (i % 2 == 0) { pares.add(i) } }
    for (i in inteiros) { if (i % 2 != 0) { impares.add(i) } }
    for (i in inteiros) { if (i > 0) { positivos.add(i) } }
    for (i in inteiros) { if (i < 0) { negativos.add(i) } }

    println("${pares.size} valor(es) par(es)")
    println("${impares.size} valor(es) impar(es)")
    println("${positivos.size} valor(es) positivo(s)")
    println("${negativos.size} valor(es) negativo(s)")

}