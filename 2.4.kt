fun main(){
    //2.4. Leia 3 valores diferentes e mostre a soma dos 2 maiores.
    val n1: Int
    var n2 :Int
    var n3 : Int
    var soma : Int = 0
    println("Escreva três números: ")
    n1 = readln().toInt()
    n2 = readln().toInt()
    n3 = readln().toInt()

    if (n1<n2 && n1 < n3 )
    {
        soma = soma + n3 + n2
    }
    else if (n2<n1 && n2 < n3 )
    {
        soma = soma + n3 + n1
    }
    else
    {
        soma = soma + n1 + n2
    }

    println("A soma dos dois maiores é : $soma")



}