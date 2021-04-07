package com.leozhi.topic268

/**
 * @author leozhi
 * 268. 丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 * 进阶：
 * 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 */
fun main() {
    val solution = Solution01()
    solution.missingNumber(intArrayOf(0, 1))
}