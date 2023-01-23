def main(args: Array[String]) = {
    println("Exemplo 1: ")

    // Cria uma lista
    val x = List(1, 2, 3, 4)

    // imprime os elementos da lista
    x.foreach{ println }

    println("Exemplo 2: ")

    // variavel escalar
    var soma = 0

    // Para cada elemento da lista, somamos o elemento à variavel soma e imprimimos o resultado
    x.foreach(soma += _)
    println(soma)

    println("Exemplo 3: ")
    val nomes = List("Amber", "Alexandre", "Sara", "Izzy", "Noah", "Emanuelle")
    //for (nome <- nomes) println(nome)
    nomes.foreach{ println }

    println("Exemplo 4: ")
    for (nome <- nomes if nome.startsWith("A")) println(nome)

    println("Exemplo 5: ")
    // loop pela lista
    for (nome <- nomes) do

        val nome_maiusculo = nome.toUpperCase
        println(nome)
        println(nome_maiusculo)

    println("Exemplo 6: ")
    // loop pela lista com condicional
    for (contador <- 0 until nomes.length) {

        if( nomes(contador) == "Alexandre") {
            println("Amber está na posição: " + contador + " da lista de nomes")

        } else {
            println("Amber não está na posição: " + contador + " da lista de nomes")
        }
    }
    
}