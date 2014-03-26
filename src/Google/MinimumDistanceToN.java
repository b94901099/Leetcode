/*
 * 白人女，一个二维数组代表了城市中的坐标，给定N个人的坐标，求坐标使所有人
 * 走到这个坐标的距离的和最小，只可以横着或者竖着走，不可以斜着走
 * 思路 假設下面兩點有人, 各自產生一個二維矩陣, 紀錄各點到自己的距離
 * {{0,0,0,0},
 *  {0,0,1,0},
 *  {0,0,0,0},
 *  {0,1,0,0}}
 * 所以會得到
 * {{4,3,4,5},
 *  {3,2,3,4},
 *  {2,1,2,3},
 *  {1,0,1,2}}
 * 和
 * {{3,2,1,2},
 *  {2,1,0,1},
 *  {3,2,1,2},
 *  {4,3,2,3}}
 * 兩個矩陣相加求最小值, 最小值的 index 即為所求坐標
 */
package Google;

public class MinimumDistanceToN {

    public static void main(String[] args) {
    }
}