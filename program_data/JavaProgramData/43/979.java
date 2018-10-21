package <missing>;

public class GlobalMembers
{
	public static int[] p = new int[11000];
	public static int i;
	public static int j;
	public static int m;
	public static int Main()
	{
		for (i = 0, scanf("%d", m); i <= m; i++)
		{
			p[i] = 0;
		}
		for (i = 2; i * i < m; i++)
		{
				for (j = i * 2;p[i] == 0 && j <= m; j += i)
				{
					p[j]++;
				}
		}
		for (i = 2; i <= m / 2; i++)
		{
			if (p[i] + p[m - i] == 0)
			{
				System.out.printf("%d %d\n", i, m - i);
			}
		}
		return 0;
	}

}
