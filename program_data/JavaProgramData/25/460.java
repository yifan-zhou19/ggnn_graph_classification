package <missing>;

public class GlobalMembers
{
	/*
	 * a3.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */

	/*
	 * 3.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		int[] a = new int[100];
		int i = 0;
		int n;
		int b = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 32)
		{
			for (i = 0;i < n;i++)
			{
				b *= 2;
			}
			System.out.print(b);
			System.out.print("\n");
		}
		else
		{
			a[0] = 2;
			int len = 1;
			int j = 0;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < len;j++)
			{
				a[j] = a[j] * 2;
			}
			for (j = 0;j < len;j++)
			{
				if (a[j] >= 10)
				{
					a[j + 1]++;
					a[j] = a[j] - 10;
				}
			}
			if (a[len] != 0)
			{
				len++;
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		//}
		System.out.print("\n");
		}
		return 0;
	}

}

