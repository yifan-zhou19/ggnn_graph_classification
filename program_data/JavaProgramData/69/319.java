import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * p.cpp
	 *
	 *  Created on: 2011-12-2
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String aa = new String(new char[300]);
		String bb = new String(new char[300]);
		int[] a = new int[300];
		int[] b = new int[300];
		int[] c = new int[300];
		aa = new Scanner(System.in).nextLine(); //??aa?
		bb = new Scanner(System.in).nextLine(); //??bb?

		int l1;
		int l2;
		int t = 0;
		int step = 0;
		int i;
		l1 = aa.length();
		l2 = bb.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < l1;i++)
		{
			a[l1 - i - 1] = aa.charAt(i) - '0'; //?aa?????????a?
		}
		for (i = 0;i < l2;i++)
		{
			b[l2 - i - 1] = bb.charAt(i) - '0'; //?bb?????????b?
		}
		while (step < l1 || step < l2)
		{ //??????
			c[step] = a[step] + b[step] + t;
			t = c[step] / 10;
			c[step] = c[step] % 10;
			step++;
		}
		if (t > 0)
		{
			c[step++] = t; //????
		}
		for (i = step - 1;i >= 0;i--)
		{
			if (c[i] != 0 || i == 0)
			{
				break; //????0
			}
		}
		for (;i >= 0;i--)
		{
			System.out.print(c[i]);
		}
		return 0;
	}
}
