//2.9. Leia o ano de nascimento e informe se a pessoa pode votar no ano atual
// (sem considerar o mês).
fun main()
{
    votoObrigatorio()

}
fun votoObrigatorio()
{
    val ano: Int = 2026

    println("Informe seu ano de nascimento: ")

    val nasc = readln().toInt()

    var idade = ano - nasc

    if (idade > 0 && idade < 18)
    {
        println("Você tem $idade anos. Você não poderá votar esse ano..")
        votoObrigatorio()
    }
    else if (idade >= 18 && idade < 120)
    {
        println("Você tem $idade anos! Seu voto é obrigatório. ")
    }
    else
    {
        print("Data inválida. Tente de novo: \n")

        votoObrigatorio()
    }
}