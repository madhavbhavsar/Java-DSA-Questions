package com.company;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Add2Number {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2,new ListNode(3,new ListNode(4,null)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(7,null)));

        ListNode ans = addTwoNumbers(l1,l2);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = null;
        ListNode temp;
        int c=0;

        while(l2!=null || l1!=null){

            int a=0,b=0;
            if(l1!=null){
                a = l1.val;
            }
            if(l2!=null){
                b = l2.val;
            }
            int s = a+b+c;

            if(s>9){
                c=1;
                s=s%10;
            }else {
                c=0;
            }
            temp = new ListNode(s,null);
            ans = temp;
            ans = ans.next;
            l2=l2.next;
            l1=l1.next;

        }
        if(c==1){
            temp = new ListNode(1,null);
            ans = temp;
        }
        return ans;

    }
}
