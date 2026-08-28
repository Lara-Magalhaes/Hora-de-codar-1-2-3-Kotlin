fun main() {
    //2.3. Leia 3 valores diferentes e mostre o maior.

    var n1: Int
    var n2: Int
    var n3: Int
    println("Nos informe três números diferentes :")
    n1 = readln().toInt()
    n2 = readln().toInt()
    n3 = readln().toInt()

    while (n1 == n2 || n2 == n3 || n1==n3)
    {
        println("Os números precisam ser diferentes")
        n1 = readln().toInt()
        n2 = readln().toInt()
        n3 = readln().toInt()

    }


        if (n1 > n2 && n1 > n3)
        {
        println("$n1 é o maior")
        }
        if (n2 > n1 && n2 > n3)
        {
            println("$n2 é o maior")
        }
        if (n3 > n2 && n1 < n3)
        {
            println("$n3 é o maior")
        }
}
