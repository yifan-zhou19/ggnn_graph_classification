package <missing>;

public class GlobalMembers
{
	/**
	 * @file        5.cpp
	 * @author      ???
	 * @date        2013-11-13
	 * @description ?????????2?N??
	 */
	public static int Main()
	{
		int N;
		int[] a = new int[100];
		int i;
		int k;
		a[99] = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < N ; i++)
		{
			for (k = 1 ; k <= 100 ; k++)
			{
				a[100 - k] *= 2;
			}
			for (k = 1 ; k <= 100 ; k++)
			{
				if (a[100 - k] > 9)
				{
					a[99 - k] += a[100 - k] / 10;
					a[100 - k] %= 10;
				}
			}
		}
		for (k = 0 ; k < 100 ; k++)
		{
			if (a[k] != 0)
			{
				break;
			}
		}
		for (; k < 100 ; k++)
		{
			System.out.print(a[k]);
		}
		return 0;
	}
}

