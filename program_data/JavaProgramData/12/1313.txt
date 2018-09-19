package <missing>;

public class GlobalMembers
{
	/*
	 * bla.cpp
	 *
	 *  Created on: 2012-11-4
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int m;
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (m == -1)
			{
				break;
			}
			int[] a = new int[15];
			int i = 0;
			int j;
			int k;
			int count = 0;
			a[0] = m;
			while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				if (m == 0)
				{
					break;
				}
				i++;
				a[i] = m;
			}
			k = i + 1;
			for (i = 0;i < k;i++)
			{
				for (j = 0;j < k;j++)
				{
					if (a[i] == 2 * a[j])
					{
						count++;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}
}

