package praticandoprogramacao

/**
 * Desafio:
 * Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2.
 * Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira a passar os dois cabos por dentro dele.
 * Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos,
 * qual o raio do menor círculo que possa englobar ambos os dois?
 *
 * Entrada:
 * Na primeira linha teremos um inteiro T (T ≤ 10000), indicando o número de casos de teste.
 * Na única linha de cada caso teremos dois números inteiros R1 e R2, indicando os respectivos raios.
 * Os inteiros serão positivos e todas as contas caberão em um inteiro normal de 32 bits.
 *
 * Saída:
 * Em cada caso, imprima o menor raio possível em uma única linha
 */
fun main() {

    val times = readLine()!!.toInt()

    for (i in 1..times) {
        val (a, b) = readLine()!!.trim().split("\\s+".toRegex()).map (String::toInt)
        println(a+b)
    }

}