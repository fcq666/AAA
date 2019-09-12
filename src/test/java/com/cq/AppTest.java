package com.cq;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * 第一种，score[j] 和 score[j+1] 比较 如果 前者比后者小，把前者和后者调换顺序，
     * 两两调换后一轮下来 最小的会被排到最后去。每一轮j都从0开始，当i轮排序，就有最后面的i个数字因为他是最小的，
     * 所以后面的每轮都不用理他了，也就是 score.length-1-i  往后的数不用管了
     */
    @Test
    public void shouldAnswerWithTrue() {
        int score[]={10,55,4,22,33,99,77,100};
        for(int i =0;i < score.length - 1;i++) {
            for(int j = 0;j < score.length - 1-i;j++)// j开始等于0，
            {
                if(score[j] < score[j+1])
                {
                    int temp = score[j];//第一次==》{55,10,4,22,33,99,77,100};
                    score[j] = score[j+1];
                    score[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(score));
    }
}
