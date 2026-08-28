


    fun main() {
//1.1. Crie uma variável chamada nome_do_carro, atribua o valor "Fusca" e exiba esse valor na tela.
        //1.2. Peça ao usuário que informe o nome e exiba a mensagem: Olá, [NomeDoUsuario].
        //1.3. Peça ao usuário nome e idade e exiba: Olá, [NomeDoUsuario], sua idade é [idade]

        var nome_do_carro = "Fusca"
        println("Você escolheu o modelo: $nome_do_carro")

        val nome: String
        print("Informe seu nome por favor: ")
        nome = readln()
        println("Olá, $nome !")

        println("Informe sua idade por favor: ")

        var idade: Int  = readln().toInt()
        println("Seu nome é $nome e você tem $idade anos")

    }



