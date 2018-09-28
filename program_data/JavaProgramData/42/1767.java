package <missing>;

public class GlobalMembers
{
	/**
	 * @file   2.cpp
	 * @author ???
	 * @date   2013-10-30
	 * @description
	 *         ?????????(11-4) ????????
	 */



	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		int c = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (; c < n; ++c)
		{
			if (a[c] != k)
			{
				System.out.print(a[c]);
				++c;
				break;
			}
		}

		for (; c < n; ++c)
		{
			if (a[c] != k)
			{
				System.out.print(" ");
				System.out.print(a[c]);
			}
		}

		return 0;
	}
}

