package <missing>;

public class GlobalMembers
{
	public static int[] p = new int[50001];

	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p[0] = p[1] = 0;
		for (i = 2; i <= n; ++i)
		{
			p[i] = 1;
			for (j = 2; j * j <= i; ++j)
			{
				if (i % j == 0)
				{
					p[i] = 0;
					break;
				}
			}
		}
		for (i = 6; i <= n; i += 2)
		{
			for (j = 3; j <= n; j += 2)
			{
				if (p[j] != 0 && p[i - j] != 0)
				{
					System.out.printf("%d=%d+%d\n", i, j, i - j);
					break;
				}
			}
		}
		return 0;
	}

}

