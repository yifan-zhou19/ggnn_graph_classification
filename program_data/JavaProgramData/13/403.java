package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012889_26.cpp
	 *
	 *  Created on: 2010-10-31
	 *      Author: ???
	 *        ????????????
	 */



	public static int Main()
	{
		int m;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[m]; //????
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < i;j++) //??????????????
			{
				if (a[j] == a[i])
				{
					break;
				}
			}
			if (j == i)
			{
				if (j == 0)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}

		}
		return 0;
	}

}

