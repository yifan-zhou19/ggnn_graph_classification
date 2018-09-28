package <missing>;

public class GlobalMembers
{
	/*
	 *???: increasing_odds.cpp
	 *??: ???
	 *????: 2012-11-05
	 *??: ?????????????????
	 */



	public static int Main()
	{
		int[] a = new int[MAXN + 10];
		int n;
		int nOdds = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			if ((a[i] & 1) != 0) //??a[i]???
			{
				a[nOdds++] = a[i]; //?????1
			}
		}
		for (int i = 0;i < nOdds;i++)
		{ //?????
			for (int j = 0;j < nOdds - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		for (int i = 0;i < nOdds;i++)
		{
			System.out.print(a[i]);
			if (i != nOdds - 1)
			{
				System.out.print(',');
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}


}

