package <missing>;

public class GlobalMembers
{
	/*
	 * ???:test1.cpp
	 * ??:???
	 * ????: 2010-12-24
	 * ??:???????N,?2?? N ????,????????????????????
	 */

	public static int Main()
	{
		int N; //????
		int x;
		int t;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[N + 1]; //????
		int i = 0;
		int m = 0;
		while (N > 0)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x % 2 != 0)
			{
				a[i] = x;
				m++;
				i++;
			} //???????
			N--; //N???????
		}
		for (int j = 0;j < m - 1;j++)
		{
			for (int k = 0;k < m - j - 1;k++)
			{
				if (a[k] > a[k + 1])
				{
					t = a[k];
					a[k] = a[k + 1];
					a[k + 1] = t;
				}
			} //?????????
		}
		System.out.print(a[0]);
		for (int j = 1;j < m;j++)
		{
			System.out.print(',');
			System.out.print(a[j]);
		}
		return 0; //????
	}

}

