fun main()
//3.3. Calcule e exiba a média aritmética dos números inteiros de 15 a 100 (inclusive).
{
    var soma : Double = 0.0
    var media : Double = 0.0

    for ( i in 15 .. 100)
    {

        soma = soma + i
    }
    media = (soma)/86

    print("\nA soma é : $soma. ")
   print("E a média é : $media ")
}