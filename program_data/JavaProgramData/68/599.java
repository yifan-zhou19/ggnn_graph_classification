package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int j;
		if (x == 2)
		{
			return 1;
		}
		for (j = 2; j <= Math.sqrt(x); j++)
		{
			if (x % j == 0)
			{
				return 0;
			}
		}
		return 1;

	}
	public static void Main()
	{
		int i;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6; m <= n; m += 2)
		{
			for (i = 2; i <= m / 2; i++)
			{
				if ((sushu(i) == 1) && (sushu(m - i) == 1))
				{
					System.out.printf("%d=%d+%d\n", m, i, m - i);
					break;
				}
			}
		}


	}
}

