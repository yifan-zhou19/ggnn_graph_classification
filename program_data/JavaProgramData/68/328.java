package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int m;
		int sushu = int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 6;j <= n;j += 2)
		{
			for (m = 3;m <= (n / 2);m += 2)
			{
				if (sushu(m) + sushu(j - m) == 2)
				{
					System.out.printf("%d=%d+%d\n", j,m,j - m);
					break;
				}
			}
		}
		return 0;
	}

	public static int sushu(int a)
	{
		int i;
		for (i = 3;i <= Math.sqrt(a);i += 2)
		{
			if (a % i == 0)
			{
				return 0;
				break;
			}
		}
		return 1;
	}
}

