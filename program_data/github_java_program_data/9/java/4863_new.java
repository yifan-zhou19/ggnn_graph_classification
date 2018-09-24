package com.mengka.jvm.mkstackoverflowerror_02;

/**
 * �������򣬵ݹ鷽�����ô���̫�࣬���·���ջ��� <br>
 * <br>
 * ��-XssĬ�ϴ�С����<br>
 * JDK5.0�Ժ�ÿ���̶߳�ջ��СΪ1M,��ǰÿ���̶߳�ջ��СΪ256K<br>
 * <br>
 * ���������<br>
 * ������ջ��С����Ϊ2M��-Xss1M
 * <hr>
 * Exception in thread "main" java.lang.StackOverflowError<br>
 * at com.mengka.jvm.mkstackoverflowerror_02.QuicksortUtil.quicksort(
 * QuicksortUtil.java:19)<br>
 * at com.mengka.jvm.mkstackoverflowerror_02.QuicksortUtil.quicksort(
 * QuicksortUtil.java:22)<br>
 * at com.mengka.jvm.mkstackoverflowerror_02.QuicksortUtil.quicksort(
 * QuicksortUtil.java:22)<br>
 * at com.mengka.jvm.mkstackoverflowerror_02.QuicksortUtil.quicksort(
 * QuicksortUtil.java:23)<br>
 * at com.mengka.jvm.mkstackoverflowerror_02.QuicksortUtil.quicksort(
 * QuicksortUtil.java:22)<br>
 * at com.mengka.jvm.mkstackoverflowerror_02.QuicksortUtil.quicksort(
 * QuicksortUtil.java:23)<br>
 * at com.mengka.jvm.mkstackoverflowerror_02.QuicksortUtil.quicksort(
 * QuicksortUtil.java:22)<br>
 * at com.mengka.jvm.mkstackoverflowerror_02.QuicksortUtil.quicksort(
 * QuicksortUtil.java:23)<br>
 * <br>
 * 
 * @author mengka.hyy
 * 
 */
public class stackOverFlowError_02 {

	public static void main(String[] args) {

		int[] aa = new int[10000];
		for (int i = 0; i < 10000; i++) {
			aa[i] = 10000 - i;
		}

		int low = 0;
		int high = aa.length - 1;

		/**
		 * �ݹ����̫�࣬���·���ջ���
		 */
		QuicksortUtil.quicksort(aa, low, high);

		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i] + ",");
		}
	}

}
