//An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
//
//Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

fun sequentialDigits(low: Int, high: Int): List<Int> {
    val lowDigitCount = low.toString().length
    val highDigitCount = high.toString().length
    val answer = mutableListOf<Int>()
    for (digitCount in lowDigitCount..highDigitCount) {
        val base = (1..digitCount).reduce{a, v -> a*10 + v}   //2 -> 12; 5 -> 12345
        val delta = (1..digitCount).reduce{a, _ -> a*10 + 1}  //2 -> 11; 5 -> 11111
        for (i in 0..9-digitCount) 
            if (base + i * delta >= low && base + i * delta <= high) answer.add(base + i * delta)
        }
    return answer
}
