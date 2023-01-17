// Tipos de dados suportados em Scala

// função main para o script poder ser executado
def main(args: Array[String]) =

    // variáveis e constantes
    var a: Byte = 1
    var b: Int = 5 // o int aloca um espaço intermediário na memória
    val c: Long = 10000 // o long ocupa um espaço maior
    var d: Short = 4 // o short ocupa um espaço menor que o int 
    val e: Double = 1.0 
    val f: Float = 1.5
    var g: String = "OI eu sou uma String" // Strings usam SEMPRE aspas duplas
    var h: Char = 'A' // Char é apenas 1 letra e SEMPRE usa aspas simples
    var i = 123 // o Scala entende que é um inteiro, como em python
    val j = 1.0
    var l = 1_000L // dado de tipo Literal Integral
    val m = 2.2D
    val n = 3.3F
    var o = BigInt(1_123_567_890_987_654_321L)
    var p = BigDecimal(1_123_567.789)
    var q = List(1, 2, 3)

    println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " " + j)
    println(l + " " + m + " " + n + " " + o + " " + p + " " + q)