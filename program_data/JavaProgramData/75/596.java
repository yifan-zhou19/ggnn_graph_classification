package <missing>;

public class GlobalMembers
{
	/**
	 * @file   5.cpp
	 * @author ???
	 * @date   2013-10-30
	 * @description
	 *         ????????????
	 */



	public static int Main()
	{
		int[] a = new int[1000]; // ??a?b??????????t????????????
		int[] b = new int[1000];
		int[] t = new int[1000];
		int k = 1;
		int c = 0;

		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (System.in.read() == ',') // ??????????????????i??????
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			++k;
		}

		System.out.print(k);

		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		k = 1;

		while (System.in.read() == ',') // ???i??????
		{
			b[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			++k;
		}

		for (int i = 0; i < k; ++i) // ????????????
		{
			for (int j = a[i]; j < b[i]; ++j)
			{
				++t[j];
			}
		}

		for (int n = 1; n < 1000; ++n) // ????????????
		{
			if (t[n] > t[c])
			{
				c = n;
			}
		}

		System.out.print(" ");
		System.out.print(t[c]);

		return 0;
	}
}

