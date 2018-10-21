package <missing>;

public class GlobalMembers
{
	/*
	 * xunhuanyidong.cpp
	 *
	 *  Created on: 2010-12-8
	 *      Author: Administrator
	 */
	public static void move(tangible.RefObject<Integer> x, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tmp=null,k,j;
		 int tmp = null;
		 int k;
		 int j;
		 tmp = x.argValue + n;
		 for (k = 0;k < m;k++)
		 {
			 *(tmp + k) = *(x.argValue + n - m + k);
		 }
		 for (j = n - m - 1;j >= 0;j--)
		 {
				 *(x.argValue + j + m) = *(x.argValue + j);
		 }
		 for (j = 0;j < m;j++)
		 {
			 *(x.argValue + j) = *(tmp + j);
		 }
	}
	public static int Main()
	{
		int m;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[n];
		int i;
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = num[0];
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		move(tempRef_p, n, m);
		p = tempRef_p.argValue;
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[n - 1]);
		System.out.print("\n");
		return 0;
	}


}

