//3.5. Leia 2 notas de um aluno, calcule a média final e considere aprovação
// com nota 9,5.
// Em seguida, pergunte: Calcular a média de outro aluno? (S/N).
// Se a resposta for S, repita;
// caso contrário, encerre e mostre a quantidade de alunos aprovados.

fun main()
{
    var numeros = DoubleArray(2)
    var media: Double = 0.0
    var resposta: String = "S"
    var contadorAprov: Int = 0

    while (resposta == "S" || resposta == "SIM" || resposta == "sim")
    {
        println("Informe duas notas: ")
        for (i in 0 until 2) {
            numeros[i] = readln().toDouble()
        }
        media = (numeros[0] + numeros[1]) / 2

        if (media >= 9.5) {
            println("Parabéns! Você foi aprovado com uma média de : $media")
            contadorAprov = contadorAprov + 1
        } else {
            println("Média insuficiente, sua média foi $media. \n Status : reprovado")
        }

        println("Deseja calcular a média de outro aluno? (S/N)\n")

        resposta = readln().trim().uppercase()

        if (resposta.uppercase() == "S" |)
        {
            println("Sem problemas, você será redirecionado...\n")
        }
        else if (resposta.lowercase() == "N" || resposta == "NÃO" || resposta == "NAO")
        {
            println("Sem problema , o número de aprovados é : $contadorAprov")
        }
    }

}
