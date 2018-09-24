package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int j;
		if (x == 3)
		{
		return 1;
		}
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			if (sushu(i) != 0)
			{
				j = m - i;
				if (sushu(j) != 0)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}

}

