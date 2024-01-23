package org.example;

public class Main1 {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int temp = 1;
        int zerosNum = 0;
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zerosNum++;
                if (zerosNum == 2) return answer;
                else zeroIndex = i;
            } else temp *= nums[i];
        }

        switch (zerosNum) {
            case 1: {
                answer[zeroIndex] = temp;
                return answer;
            }
            case 0: {
                for (int i = 0; i < nums.length; i++)
                    answer[i] = temp / nums[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        productExceptSelf(new int[]{4,3,2,1,2});
    }
}