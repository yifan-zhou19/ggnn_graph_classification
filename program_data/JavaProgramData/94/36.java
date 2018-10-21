package <missing>;

public class GlobalMembers
{
	/*
	* ????1000012865_33
	* ??????
	* ???2010-11-3
	* ??:????????
	*/
	public static int Main()
	{
		int N;
		int[] n = new int[501];
		int m;
		int a = 0;
		int i;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= N; i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= N; i++)
		{
			for (int j = 1; j <= N - i; j++)
			{
				if (n[j] > n[j + 1])
				{
					m = n[j + 1];
					n[j + 1] = n[j];
					n[j] = m;
				}
			}
		}
		for (i = 1,m = 0; i <= N - 1; i++)
		{
			if (n[i] % 2 != 0)
			{
				m++;
			}
		}
		for (i = 1;a < m - 1; i++)
		{
			if (n[i] % 2 != 0)
			{
				System.out.print(n[i]);
				System.out.print(',');
				a++;
			}
		}
		for (i; i <= N; i++)
		{
			if (n[i] % 2 != 0)
			{
				System.out.print(n[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

