//3.9. Leia 10 valores e informe quantos estão no intervalo
// de 24 a 42 (inclusive) e quantos estão fora.

fun main()
{
    var valores = DoubleArray(10)
    var cont : Int = 0
    var fora: Int = 0

    println("Informe dez valores: ")
    for (i in 0 until 10)
    {
        valores[i] = readln().toDouble()
    }

    for (i in 0 until 10)
    {
        if (valores[i]  >= 24 && valores[i] <=42)
            cont = cont +1
        else
            fora = fora +1
    }
    println("\nA quantidade de números dentro do intervalo é: $cont")
    println("\nA quantidade de números fora do intervalo é: $fora")

}