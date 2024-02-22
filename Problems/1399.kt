//You are given an integer n.
//Each number from 1 to n is grouped according to the sum of its digits.
//Return the number of groups that have the largest size.

fun Int.digitSum(): Int {
    var n = this
    var r = 0
    while (n > 0) {
        r += n % 10
        n = n / 10
    }
    return r
}

fun countLargestGroup(n: Int): Int {
    var m = 0  
    return (1..n).map{d -> d.digitSum()}.groupingBy{it}.eachCount().let{m = it.values.max(); it}.count{it.value == m}
}
