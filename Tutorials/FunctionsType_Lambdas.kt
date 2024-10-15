fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)

    treatFunction()
    trickFunction()
}


fun trickOrTreat(isTrick: Boolean, extraTreat: Int): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println("extraTreat is $extraTreat")
        return treat
    }
}
