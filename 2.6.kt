fun main()
{
//2.6. Leia 4 valores diferentes e informe apenas o primeiro, o último e o maior deles.
    var numeros = IntArray(4)

    print("Informe 4 números: \n")
    for(i in 0 until  4)
    {
        numeros[i] = readln().toInt()

    }
    print("O primeiro número é o  ${numeros[0]}.")
    print(" O último número é ${numeros[3]}.")

    if ( numeros[0] > numeros[1] && numeros[0] > numeros[2] && numeros[0] > numeros[3]) { println(" E o maior número é o ${numeros[0]}.")}
    else if ( numeros[1] > numeros[0] && numeros[1] > numeros[2] && numeros[1] > numeros[3]) { println(" E o maior número é o ${numeros[1]}.")}
    else if ( numeros[2] > numeros[0] && numeros[2] > numeros[1] && numeros[2] > numeros[3]) { println(" E o maior número é o ${numeros[2]}.")}
    else  { println(" O maior número é o ${numeros[3]}")}
}