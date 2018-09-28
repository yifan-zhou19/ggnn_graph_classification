package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2010-11-24
	* @description
	* ??????: ????????
	*/
	public static int[][] a = new int[11][11];
	public static int k;
	public static void f(int[][] c)
	{
		int s;
		int t;
		int[][] b = new int[11][11];
		for (t = 0;t < 121;t++)
		{
			b[t / 11][t % 11] = (a + t);
		}
		for (s = 1;s < 10;s++)
		{
			for (t = 1;t < 10;t++)
			{
				a[s][t] = 2 * b[s][t] + b[s][t - 1] + b[s][t + 1] + b[s - 1][t] + b[s - 1][t - 1] + b[s - 1][t + 1] + b[s + 1][t] + b[s + 1][t - 1] + b[s + 1][t + 1];
			}
		}
		System.out.print("\n");
		if (k > 1)
		{
			k--;
			f(a);
		}
		if (k == 1)
		{
			for (s = 1;s < 10;s++)
			{
				for (t = 1;t < 9;t++)
				{
					System.out.print(a[s][t]);
					System.out.print(" ");
				}
				System.out.print(a[s][9]);
				System.out.print("\n");
			}
			k--;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n;
		a[5][5] = m;
		f(a);
		return 0;
	}

}

