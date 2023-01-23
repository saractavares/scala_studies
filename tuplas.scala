// Tuplas pode ter dados de tipos diferentes mas ainda é imutável como as listas

def main(args: Array[String])={

    println("Exemplo 1: ")

    // tupla com dados do msm tipo:
    val t = (100, 200, 30, 400)

    // soma os elementos da tupla:
    val soma = t._1 + t._2 + t._3 + t._4 
    println(soma)

    // tupla com dados de tipo diferentes
    println("Exemplo 2: ")

    val tupla = new Tuple3("eu", 10, 'a')
    println(tupla)

    println("Exemplo 3: ")
    val t_num = (1,2,3,4,5)

    // loop para imprimir cada elemento da tupla:
    t_num.productIterator.foreach { i => println("Valor = " + i)}

    println("Exemplo 4: ")
    // cria uma tupla com dados de diferentes tipos:
    val t_mix = new Tuple4('Z', "Oi", 10, 45F)

    println("concatena todos os elementos como string: " + t_mix.toString())

    println("Exemplo 5: ")
    val t_mix2 = new Tuple5('Z', "Oi", 10, 45F, "Teste")

    // loop para imprimir cada elemento da tupla convertendo para string:
    t_num.productIterator.foreach { i => println("Valor = " + i.toString() + " novo")}

    println("Exemplo 6: ")

    // cria uma tupla com dados de diferentes tipos:
    val t2 = new Tuple2('Z', "Oi")
    
    println("elementos com ordem invertida= " + t2.swap)
}