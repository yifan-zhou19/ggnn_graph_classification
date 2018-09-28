package <missing>;

public class GlobalMembers
{
	public static int iszhishu(int n)
	{
		int i;
		int sum = 0;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				sum = sum + 1;
			}
		}
			if (sum == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
	}

	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			if (iszhishu(i) != 0 && iszhishu(m - i) != 0)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}

		return 0;
	}
}

