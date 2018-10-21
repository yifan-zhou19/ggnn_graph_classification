package <missing>;

public class GlobalMembers
{
	public static int ispr(int t)
	{
		int v = (int)Math.sqrt(t * 1.0) + 1;
		for (int i = 2; i < v; i++)
		{
			if (t % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}


	public static int sum;
	public static void fun(int n,int i)
	{
		if (n == 1)
		{
			sum++;
		}
		for (; i <= n; i++)
		{
			if (n % i == 0)
			{
				fun(n / i, i);
			}
		}
		return;
	}


	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0; j < n; j++)
		{
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (ispr(a) == 1)
			{
				System.out.print("1\n");
				continue;
			}

			int res = 1;
			for (int i = 2; i <= a / 2; i++)
			{
				if (a % i == 0)
				{
					sum = 0;
					fun(a / i, i);
					res = res + sum;
				}

			}
			System.out.printf("%d\n",res);
		}

		return 0;
	}

}

