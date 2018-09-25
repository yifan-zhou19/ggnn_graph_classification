package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[25];
	public static int[] d = new int[25];
	public static int k;
	public static int D(int a)
	{
		int m = 1;
		for (int i = a + 1; i <= k - 1; i++)
		{
			if (c[i] <= c[a] != 0 && m < D(i) + 1)
			{
				m = D(i) + 1;
			}
		}
		return m;
	}

	public static int Main()
	{
		int max = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = k - 1; i >= 0; i--)
		{
			d[i] = D(i);
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		System.out.print(max);
		return 0;
	}
}

