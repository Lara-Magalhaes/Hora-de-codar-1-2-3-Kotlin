fun main()
{    //2.7. Leia 6 números. Some apenas os valores menores que 72.//
    // Exiba a soma e todos os valores informados.
    var numeros = IntArray(6)
    var soma: Int = 0
    var somaReal: Double
    println("Informe 6 números:")
    for (i in 0 until 6)
        {
        numeros[i] = readln().toInt()

        if (numeros[i] < 72)
        {
            soma = soma + numeros[i]

        }
    }
    somaReal = soma.toDouble()
    println ("A soma é:  $somaReal")

    println(" Os números escolhidos são: ")
    for (i in 0 until 6)
    {
        print("${numeros[i]} ")
    }
}
