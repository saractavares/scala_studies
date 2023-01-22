/// listas em escala são IMUTAVEIS e devem ter dados do MESMO TIPO 

def main(args: Array[String]) = 

    // lista de strings
    val frutas: List[String] = List("laranja", "pera", "maça")

    // lista de numeros
    val numeros: List[Int] = List(1,2,3,4)
    
    // lista de numeros escalar
    val nums = Nil // Nil significa Vazio

    // inválidos
    //val mix: List[String] = List(1, "melancia")

    println("Tamanho da lista de frutas: " + frutas.length)
    println("Head da lista de frutas: "+ frutas.head)
    println("Tail da lista de frutas: "+ frutas.tail)
    println("Reverse da lista de frutas: "+ frutas.reverse)
    println("Checa se a lista de frutas está vazia: " + frutas.isEmpty)
    println("Checa se a variavel está vazia: " + nums.isEmpty)
    println("Primeiro elemeto da lista de numeros: " + numeros(0))
    println("Segundo elemento da lista de numeros: " + numeros(1))
    println("Soma da lista de numeros: " + numeros.sum)
    println("Maximo da lista de numeros: " + numeros.max)
    println("Minimo da lista de numeros: " + numeros.min)
