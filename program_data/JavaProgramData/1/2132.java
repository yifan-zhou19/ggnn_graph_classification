package <missing>;

public class GlobalMembers
{
	public static int fenjie(int n,int min)
	{
		int i;
		int a = 0;
		int x = 0;
	for (i = 2;i <= n;i++)
	{
	if (n % i == 0)
	{
	a = a + 1;
	}
	}
		if (n == 1)
		{
		return 1;
		}
		else
		{
			for (i = min;i <= n;i++)
			{
				if (n % i == 0)
				{
				x = x + fenjie(n / i, i);
				}
			}
			return x;
		}
	}
	public static int Main()
	{
		int t;
		int j;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= t;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fenjie(num, 2));
		}
	}
}

