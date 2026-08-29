fun main(){
//3.2. Leia dois valores. Enquanto o segundo valor for menor ou igual a zero, // peça novamente
// Ao final, mostre a divisão do primeiro pelo segundo.

    print("Informe dois números: \n")
    var N1 : Double = readln().toDouble()
    var N2 : Double = readln().toDouble()

while (N2<=0)
{
    print("O segundo número precisa ser maior que zero. Digite-o novamente: \n")
    N2 = readln().toDouble()
}
var div = N1/N2
if (N2>0)
{
print("Números aceitos!\n")
    print("A divisão entre eles é : $div ")
}

}