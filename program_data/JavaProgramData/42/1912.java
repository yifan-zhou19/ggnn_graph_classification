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
		int[] a = new int[100000]; // ??????100000?????
		int n;
		int k;
		int c = 0;
		int i;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; ++i) // ???????n?
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (; c < n; ++c)
		{
			if (a[c] == k) // ?????????????????????????n?1
			{
				for (i = c; i < n - 1; ++i)
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
				--n;
				c = -1;
			}
		}

		System.out.print(a[0]);

		for (c = 1; c < n; ++c) // ???????...??
		{
			System.out.print(" ");
			System.out.print(a[c]);
		}

		return 0;
	}
}

