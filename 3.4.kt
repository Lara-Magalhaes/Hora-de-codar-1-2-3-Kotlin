//3.4. Leia dois inteiros (sendo o primeiro menor que o segundo) e
// calcule a média desses números e de todos os inteiros entre eles.

fun main()
{
    var media1 : Double = 0.0
    var media2 : Double = 0.0
    var soma : Double = 0.0
    var contador : Int = 0

    println("Informe dois números, sendo que o primeiro precisa ser menor que o segundo: \n")
    var n1 : Int = readln().toInt()
    var n2 : Int = readln().toInt()

    while(n1>=n2)
    {
        print("O segundo número precisa ser maior que o primeiro: \n")
        n2  = readln().toInt()
    }
media1 = (n1.toDouble() + n2.toDouble())/2
    println("A média entre os números extremos é : $media1")


    for ( i in n1 .. n2)
    {
        soma = soma + i
        contador = contador + 1
    }
if (contador > 0)
{
    media2 = soma/contador
    println("A média de todos os inteiros entre eles é : $media2")
}
    else { print("A média não pode ser calculada")}
}