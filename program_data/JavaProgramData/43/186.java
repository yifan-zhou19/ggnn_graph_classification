package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int jishu = int x;
		int sushu = int x;
		int m;
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= (m / 2); i++)
		{
			if (sushu(i) != 0 && jishu(i) != 0)
			{
				a = m - i;
				if (jishu(a) != 0 && sushu(a) != 0)
				{
					System.out.printf("%d %d\n",i,a);
				}
			}
		}

		return 0;
	}
	public static int jishu(int x)
	{
		int d;
		if (x % 2 == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int sushu(int x)
	{
		int k;
		int i;
		int c;
		k = Math.sqrt(x);
		if (x < 3)
		{
			return 0;
		}
		else
		{
			for (i = 2; i <= k; i++)
			{
				if (x % i == 0)
				{
					break;
				}
			}
			if (i > k)
			{
				return 1;
			}

			else
			{
				return 0;
			}
		}

	}

}

