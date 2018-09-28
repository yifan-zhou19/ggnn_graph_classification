package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sushu = int x;
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			k = sushu(i);
			if (k == 1)
			{
				j = m - i;
				if (sushu(j) == 1)
				{
					System.out.printf("%d %d\n",i,j);
				}

			}

		}
		return 0;
	}
	public static int sushu(int x)
	{
		int n;
		for (n = 2;n < x;n++)
		{
			if (x % n == 0)
			{
				return 0;
				break;
			}
		}
		if (n >= x)
		{
			return 1;
		}
	}

}

