package ZuoYe20210415;
/*
*ClassName:wt20210415001
*UserName:suiyidi
*CreateTime:2021-04-15 20:35
*/

import java.util.*;
//1. 模拟产生一个双色球的中奖号码
//        红球 1-33: 6 不重复的,最终结果从小到大的
//        蓝球 1-16: 1 nextInt(16)+1

public class wt20210415001 {
    public static void main(String[] args) {
        //集合实现
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        getReadBall(list, random);
        getBlueBall(list, random);
        System.out.println(Arrays.toString(list.toArray()));

        //数组实现
        unionLottos();
    }

    /**
     * 获得红色球
     *
     * @param list
     * @param random
     */
    public static void getReadBall(List<Integer> list, Random random) {
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(33) + 1;
            do {
                num = random.nextInt(33) + 1;
            } while (list.contains(num)); //如果集合中包含该值则重新复制
            list.add(num);
        }
        Collections.sort(list);//升序
        }

    /**
     * 获得蓝色球
     *
     * @param list
     * @param random
     */

    public static void getBlueBall(List<Integer> list, Random random) {
        int num = random.nextInt(16) + 1;
        list.add(num);
    }
    //数组实现
    public static void unionLottos() {
        int[] red = new int[6];
        Random r = new Random();
        int blue = r.nextInt(16) + 1;
        int temp;
        for (int i = 0; i < red.length; i++) {
            red[i] = r.nextInt(33) + 1;
            for (int j = 0; j < red.length && j != i && i != 0; j++) {
                if (red[i] == red[j]) {
                    red[i] = r.nextInt(33) + 1;
                    i--;
                }
            }
            for (int j = i; j > 0; j--) {
                if (red[j] < red[j - 1]) {
                    temp = red[j - 1];
                    red[j - 1] = red[j];
                    red[j] = temp;
                }
            }
        }
        System.out.format("双色球的开奖号码：%2s,[%d]", Arrays.toString(red), blue);
    }


}

