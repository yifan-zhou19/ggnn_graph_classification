package <missing>;

public class GlobalMembers
{
	/**
	 * @file        1.cpp
	 * @author      ???
	 * @date        2013-10-9
	 * @description ?????????
	 */
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int k = 0;
		int j = 0;
		int n = 0;
		for (i = 0 ; i < 16 ; i++)
		{
			a[i] = -1;
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k != -1)
		{
			a[j] = k;
			j++;
			if (k == 0)
			{
				for (i = 0 ; i < 15 ; i++)
				{
					for (j = i + 1 ; j < 15 ; j++)
					{
						if ((a[j] - 2 * a[i] == 0) || (a[i] - 2 * a[j] == 0))
						{
							n++;
						}
					}
				}
				System.out.print(n);
				System.out.print("\n");
				for (i = 0 ; i < 16 ; i++)
				{
					a[i] = -1;
				}
				j = 0;
				n = 0;
			}
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
}

