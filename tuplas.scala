// Tuplas pode ter dados de tipos diferentes mas ainda é imutável como as listas

def main(args: Array[String])={

    println("Exemplo 1: ")

    // tupla com dados do msm tipo:
    val t = (100, 200, 30, 400)

    // soma os elementos da tupla:
    val soma = t._1 + t._2 + t._3 + t._4 
    println(soma)
}