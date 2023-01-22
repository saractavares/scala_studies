@main def printTabela() = 

    var i = 1

    while i <= 10 do

        var j = 1

        while j <= 10 do

            val p = (i * j).toString

            var k = p.length

            while k < 4 do
                print(" ")
                k += 1

            print(p)
            j += 1

        println()
        i += 1