package <missing>;

public class GlobalMembers
{
	/**
	 * @file   5.cpp
	 * @author ???
	 * @date   2013-11-15
	 * @description
	 *         ?????????(11-12) ??2?N??
	 */



	public static int Main()
	{
		int N; // i, j, k?????????
		int k;
		int i;
		int j = 0;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = new int[100];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (k = 1; k <= N; ++k)
		{
			for (i = 0; i <= j; ++i) // ??????
			{
				if (i == 0)
				{
					b[0] = a[0];
				}
				b[i + 1] = a[i + 1];
				a[i] += b[i];
				if (a[i] >= 10)
				{
					a[i] -= 10;
					++a[i + 1];
					if (a[i + 1] == 1 && i == j)
					{
						++j;
						break;
					}
				}
			}
		}

		i = 99;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (a[--i] == 0)
		{
			;
		}
		for (; i >= 0; --i)
		{
			System.out.print(a[i]);
		}

		return 0;
	}
}

