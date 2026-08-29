//3.1. Crie uma bomba-relógio com contagem regressiva de 30 até 0 e,
// ao final, escreva EXPLOSÃO.


fun main()
{
    print("Explosão em: \n")
    for (i in 30 downTo 0)
    {
        print(" $i \n")
        Thread.sleep(600)
        if (i == 0)
        {
            println("BOOM")
        }
    }
}