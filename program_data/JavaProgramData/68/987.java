package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int result;
		int sq;
		int sum = 0;
		int i;
		sq = Math.sqrt(a);
		if (a == 2 || a == 3)
		{
			result = 1;
		}
		else if (a % 2 == 0)
		{
			result = 0;
		}
		else
		{
		for (i = 2;i <= sq;i++)
		{
			if (i % 2 == 1)
			{
				if (a % i == 0)
				{
					break;
				}
				sum++;
			}
		}
		if (sum == ((sq - 1) / 2))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		}
		return result;
	}

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
			for (i = 6;i <= n;i++)
			{
			if (i % 2 == 0)
			{
				for (j = 2;j <= i / 2;j++)
				{
					if (sushu(j) != 0 && sushu(i - j) != 0)
					{
							System.out.printf("%d=%d+%d\n",i,j,i - j);
							break;
					}
				}
			}
			}
			return 0;
	}
}

