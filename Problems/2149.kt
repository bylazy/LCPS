//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
//
//You should return the array of nums such that the the array follows the given conditions:
//
// - Every consecutive pair of integers have opposite signs.
// - For all integers with the same sign, the order in which they were present in nums is preserved.
// - The rearranged array begins with a positive integer.
//
//Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

fun rearrangeArray(nums: IntArray): IntArray {
    val answer = IntArray(nums.size){0}
    var positiveIndex = 0
    var negativeIndex = 1
    for (n in nums)
        if (n > 0) {answer[positiveIndex] = n; positiveIndex += 2}
        else {answer[negativeIndex] = n; negativeIndex += 2}
    return answer
}
