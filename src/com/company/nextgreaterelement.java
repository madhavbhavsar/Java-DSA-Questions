package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class nextgreaterelement {

    public static void main(String[] args) {

        int[] n1 = {4, 1, 2};
        int[] n2 = {1, 3, 4, 2};
        int[] ans = nextGreaterElement(n1, n2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> hp = new HashMap<>();
        int[] ans = new int[nums1.length];

        Stack<Integer> st = new Stack<>();


        for (int num : nums2) {
            while (!st.isEmpty() && num > st.peek()) {
                hp.put(st.pop(), num);
            }

            st.push(num);
        }


        int x = 0;
        for (int a : nums1) {
            ans[x] = hp.getOrDefault(a, -1);
            x++;
        }

        return ans;
    }
}
