package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        int len = Integer.parseInt(nums[0]);
        int rotate = Integer.parseInt(nums[1]);
        String[] inp = scan.nextLine().split(" ");
        int[] output = new int[len];
        for (int i = 0; i < len; i++) {
            if (i >= rotate) {
                output[i - rotate] = Integer.parseInt(inp[i]);
            }
            else {
                output[len - rotate + i] = Integer.parseInt(inp[i]);
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
