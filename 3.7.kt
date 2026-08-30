//3.7. Leia um valor N (N > 0) e imprima todos os inteiros de 1 até N.

fun main()
{
    println("Informe apenas um valor positivo")

    var num : Double = readln().toDouble()
    var contador : Int = 0

    while(num <= 0 )
    {
        println("O número precisa ser positivo e maior que 0!")
        num= readln().toDouble()
    }
while(contador < num.toInt())
{
    contador = contador + 1
    print("$contador ")
}

}

