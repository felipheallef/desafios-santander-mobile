package praticandoprogramacao

/**
 * Desafio:
 * Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas)
 * onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
 * Na sequência mostre o valor lido e a relação de notas necessárias.
 *
 * Entrada:
 * Você receberá um valor inteiro N (0 < N < 1000000).
 *
 * Saída:
 * Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo.
 * Após cada linha deve ser imprimido o fim de linha.
 */
fun main() {

    var amount = readLine()!!.toInt()
    var hundred = 0
    var fifty = 0
    var twenty = 0
    var ten = 0
    var five = 0
    var two = 0
    var one = 0

    println(amount)

    while (amount > 0) {
        if (amount >= 100) {
            hundred = amount / 100
            amount %= 100
        }
        if (amount >= 50) {
            fifty = amount / 50
            amount %= 50
        }
        if (amount >= 20) {
            twenty = amount / 20
            amount %= 20
        }
        if (amount >= 10) {
            ten = amount / 10
            amount %= 10
        }
        if (amount >= 5) {
            five = amount / 5
            amount %= 5
        }
        if (amount >= 2) {
            two = amount / 2
            amount %= 2
        }
        if (amount >= 1) {
            one = amount / 1
            amount %= 1
        }
    }

    println("$hundred nota(s) de R\$ 100,00")
    println("$fifty nota(s) de R\$ 50,00")
    println("$twenty nota(s) de R\$ 20,00")
    println("$ten nota(s) de R\$ 10,00")
    println("$five nota(s) de R\$ 5,00")
    println("$two nota(s) de R\$ 2,00")
    println("$one nota(s) de R\$ 1,00")

}