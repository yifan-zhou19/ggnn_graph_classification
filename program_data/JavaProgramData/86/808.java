package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2010-11-17
	 *      Author: qaj
	 */



	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < n;j++)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] a = new int[10];
			int l = 0;
			for (int k = 1;k <= m;k++)
			{
				a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int k = 1;k <= m;k++)
			{
				if (a[k] + 3 * k > 57)
				{
						l = k - 1;
					break;
				}
				l = k;
			}

			if ((a[l + 1] + 3 * l) == 59)
			{
				System.out.print(59 - 3 * l);
				System.out.print("\n");
			}
			else
			{
				System.out.print(60 - 3 * l);
				System.out.print("\n");
			}

		}
		return 0;
	}
}

