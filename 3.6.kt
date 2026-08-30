//3.6. Leia 6 notas válidas (de 0 a 10), calcule e exiba a média simples.
fun main()
{
var media : Double = 0.0
var notas = DoubleArray(6)
    var contador : Int = 0
    println("Informe 6 notas válidas: ")

    for (i in 0 until 6)
    {
        notas[i] = readln().toDouble()

        while (notas[i] < 0 || notas[i] > 10)
        {
            println("Informe notas válidas (de 0 à 10)")
            notas[i] = readln().toDouble()

        }

        contador = contador + 1 // Não posso declarar o contador aqui pois ele zeraria a cada volta do laço

        media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4] + notas[5]) / contador
    }
    print("Sua média é: $media")
}


