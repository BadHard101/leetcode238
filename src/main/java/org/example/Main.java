package org.example;

public class Main {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int temp = 1;
        int zerosNum = 0;
        for (int num : nums) {
            if (num == 0) {
                zerosNum++;
                if (zerosNum == 2) return answer;
            } else temp *= num;
        }

        switch (zerosNum) {
            case 0: {
                for (int i = 0; i < nums.length; i++)
                    answer[i] = temp / nums[i];
            }
            case 1: {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == 0) {
                        answer[i] = temp;
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}