package com.leozhi.topic861;

/**
 * @author leozhi
 * 861. 翻转矩阵后的得分
 * 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
 *
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 *
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 *
 * 返回尽可能高的分数。
 */
public class Main {
    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        solution.matrixScore(new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}});
        System.out.println(~0);
    }
}