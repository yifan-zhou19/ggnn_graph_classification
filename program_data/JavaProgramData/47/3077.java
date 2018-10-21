package <missing>;

public class GlobalMembers
{
	/*
	 * point1002.cpp
	 *
	 *  Created on: 2013-12-4
	 *      Author: weng
	 */


	public static int Main()
	{
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = 0;
		for (p = a ; p < a + n ; p++)
		{
			* p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		q = a + n - 1;
		for (; p < q ; p++, q--)
		{
			t =  p;
			* p =  q;
			* q = t;
		}
		p = a;
		System.out.print(p++);
		for (; p < a + n ; p++)
		{
			System.out.print(" ");
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}


}

