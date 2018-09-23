package <missing>;

public class GlobalMembers
{
	/*
	 * ??.cpp
	 *
	 *  Created on: 2011-11-2
	 *      Author:Administrator
	 */

	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int n;
		int j;
		int total;
		while ((a[0] != 0 && a[0] != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			i = 1;
			while ((a[i] != 0 && a[i] != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				i++;
			}
			n = i;
			total = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[j] == 2 * a[i])
					{
						total++;
					}
				}
			}
			System.out.print(total);
			System.out.print("\n");
		}
		return 0;
	}
}

