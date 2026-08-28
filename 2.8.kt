fun main()
{
//2.8. Leia 4 números, aceitando apenas valores ( maiores que 0 e menores que 10. )
// Calcule a média e:
// se média > 5, exiba "Você passou no teste";
//- caso contrário, exiba "Tente novamente".
    var numeros = DoubleArray(4)
    var media : Double = 0.0

    println("Informe 4 números: ")
    for( i in 0 until 4)
    {
        numeros[i] = readln().toDouble()

        while (numeros[i] <= 0 || numeros[i] >= 10)
        {
            println("O número precisa ser maior que 0 e menor que 10")
            numeros[i] = readln().toDouble()
        }
    }
        media = (numeros[0] + numeros[1] + numeros[2] + numeros[3])/4

        if (media > 5 )
        {
            print("Parabéns! Você passou no teste!")
        }
            else if  ( media <= 5 )
            {
            print("Tente novamente...\n")
            }
        println("A sua média foi : $media")


    }