package <missing>;

public class GlobalMembers
{
	/*
	 * hehe.cpp
	 *
	 *  Created on: 2012-12-11
	 *      Author:??
	 *  ?????????????????????????8,6,5,4,1?????1,4,5,6,8?
	 *
	 */
	public static int Main()
	{
		int n;
		int[] a = new int[2000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		q = n + a - 1;
		for (;p < q;p++,q--)
		{
			temp = p;
		 *p = q;
		 *q = temp; //??????????
		}
		System.out.print(a[0]);
		for (int i = 1;i < n;i++)
		{
				System.out.print(" ");
				System.out.print(a[i]);
		}
		return 0;
	}

}

