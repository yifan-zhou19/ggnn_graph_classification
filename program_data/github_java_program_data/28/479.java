package cn.edu.zju.mch.crackingthecodinginterview.Chapter2LinkedLists;

/**
 * Created by hasee on 2017/9/20.
 *
 * ���дһ����������������Ƿ�Ϊ���ġ�
 *
 * LeetCode #234
 * Could you do it in O(n) time and O(1) space?
 *
 * ���η�ת���жϺ�ǰ����Ƿ���ͬ��
 */
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        if(pHead == null || pHead.next == null){
            return true;
        }
        int n = 0;
        ListNode curr = pHead;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        int half = n / 2 + n % 2;
        curr = pHead;
        for(int i = 0; i < half; i++){
            curr = curr.next;
        }
        ListNode temp = curr;
        ListNode p;
        while(curr.next != null){
            p = curr.next;
            curr.next = p.next;
            p.next = temp;
            temp = p;
        }
        while(temp != null){
            if(pHead.val != temp.val){
                return false;
            }
            pHead = pHead.next;
            temp = temp.next;
        }

        return true;
    }
}
