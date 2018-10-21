package <missing>;

public class GlobalMembers
{
	/*
	 * c.cpp
	 * ???1100012870;
	 * ???????
	 *  Created on: 2011-10-19
	 *      Author: Li Wenpeng
	 */
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[100001];
		int n;
		int k;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			while (a[i] - k == 0)
			{
				if (m - i == 1)
				{
					m = m - 1;
					break;
				}
				for (j = i;j < m - 1;j++)
				{
					a[j] = a[j + 1];
				}
				m = m - 1;
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < m;i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		return 0;
	}
}

