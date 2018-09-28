package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			for (j = 3;j <= i != 0 && i % j != 0;j = j + 2)
			{
				;
			}
		for (k = 3;k <= m - i && (m - i) % k != 0;k = k + 2)
		{
			;
		}
			if (j == i && k == m - i)
			{
			System.out.printf("%d %d\n",j,k);
			}
		}
		return 0;
	}
}

