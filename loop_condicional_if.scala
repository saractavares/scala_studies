@main def principal(args: String*) =
    // variavel
    var i = 0

    // loop while
    while i < args.length do

        // condicional
        if i != 0 then
            print(" ")
        print(args(i))

        i+=1

    println()