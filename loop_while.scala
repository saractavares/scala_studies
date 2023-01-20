@main def principal(args: String*) =
    // variavel
    var i = 0

    // loop while
    while i < args.length do
        println(args(i))
        i += 1