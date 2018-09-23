package <missing>;

public class GlobalMembers
{
	/*
	 * 1062 ???.cpp
	 *
	 *  Created on: 2010-11-21
	 *      Author: ???
	 */
	public static int Main()
	{
		int[] x = new int[11];
		int[] y = new int[11];
		int i;
		int j;
		int l1;
		int l2;
		x[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		while (x[i] != 1)
		{
		   if (x[i] % 2 == 0)
		   {
			   i = i + 1;
			   x[i] = x[i - 1] / 2;
		   }
		   else
		   {
			   i = i + 1;
			   x[i] = (x[i - 1] - 1) / 2;
		   }
		}
		l1 = i;
		i = 1;
		while (y[i] != 1)
		{
		   if (y[i] % 2 == 0)
		   {
			   i = i + 1;
			   y[i] = y[i - 1] / 2;
		   }
		   else
		   {
			   i = i + 1;
			   y[i] = (y[i - 1] - 1) / 2;
		   }
		}
		l2 = i;
		for (i = 1;i <= l1;i++)
		{
			for (j = 1;j <= l2;j++)
			{
				if (x[i] == y[j])
				{
						System.out.print(x[i]);
						break;
				}

			}
			if (x[i] == y[j])
			{
				break;
			}
		}
		return 0;
	}
}

