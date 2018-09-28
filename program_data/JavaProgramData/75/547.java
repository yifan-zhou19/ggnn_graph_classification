import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * qimofuxi8.cpp
	 *
	 *  Created on: 2010-12-22
	 *      Author: l
	 */
	public static int Main()
	{
		String a1 = new String(new char[10000]);
		String a2 = new String(new char[10000]);
		a1 = new Scanner(System.in).nextLine();
		a2 = new Scanner(System.in).nextLine();
		int l1;
		int l2;
		int i;
		int j;
		int n = 0;
		l1 = a1.length();
		l2 = a2.length(); //?????????????
		for (i = 0;i < l1;i++)
		{
			if (a1.charAt(i) == ',')
			{
				n = n + 1;
			}
		}
		n = n + 1; //???????????
		int[] b1 = new int[n];
		int[] b2 = new int[n];
		for (i = 0;i < n;i++)
		{
			b1[i] = 0;
		}
		j = 0;
		for (i = 0;i < l1;i++)
		{
			if (a1.charAt(i) == ',')
			{
				j++;
			}
			else
			{
				b1[j] = b1[j] * 10 + a1.charAt(i) - '0'; //???a1???????????b1
			}
		}

		for (i = 0;i < n;i++)
		{
				b2[i] = 0;
		}
			j = 0;
			for (i = 0;i < l2;i++)
			{
				if (a2.charAt(i) == ',')
				{
					j++;
				}
				else
				{
					b2[j] = b2[j] * 10 + a2.charAt(i) - '0'; //????a2??????????b2
				}
			}




		int k = 0;
		int max = 0;
		for (int t = 0;t < 1000;t++)
		{
			k = 0;
			for (i = 0;i < n;i++)
			{
				if ((b1[i] <= t) && (b2[i]> t))
				{
					k = k + 1;
				}
			}
		if (k > max)
		{
			max = k; //???????
		}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}

}
