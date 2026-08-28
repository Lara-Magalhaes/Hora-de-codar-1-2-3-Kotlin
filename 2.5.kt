fun main(){
    2//.5. Leia 6 valores, exiba todos e calcule a média aritmética.
    var numeros = IntArray(6)

    var media = 0

    for (i in 0 until 6) //range //conditions 'for' i

     {
         numeros[i] = readln().toInt()
     }
    media = (numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4] + numeros[5]) /6

val mediadecimal : Double = media.toDouble()

    print("Os números escolhidos foram:")
     for (i in 0 until 6)
      {
      print("${numeros[i]} ")
      }

    print("\n")
    println("A média dos números é :$mediadecimal")
 }