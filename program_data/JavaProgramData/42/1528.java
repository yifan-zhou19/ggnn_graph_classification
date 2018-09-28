package <missing>;

public class GlobalMembers
{
	/*
	 * wwj.cpp
	 *  Created on: 2012-11-4
	 *      Author: ???  1200012899
	 */
	public static int Main()
	{
		int n;
		int[] a = new int[100001];
		int k;
		int i;
		int l;
		int j;
		int s = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
				if (a[i] == k)
				{
					s = s + 1;
				}
		}
	   for (i = 0;i < n;i++)
	   {
			l = 0;
			m = i;
			while (a[m] == k)
			{
				l = l + 1;
				m = m + 1;
			}
			if (l != 0)
			{
				for (j = i;j + l < n;j++)
				{
					a[j] = a[j + l];
				}
			}
			else
			{
				continue;
			}
	   }
			for (i = 0;i < n - s;i++)
			{
				if (i != 0)
				{
					System.out.print(" ");
				}
				System.out.print(a[i]);
			}

		return 0;
	}

}

