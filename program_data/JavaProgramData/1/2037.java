package <missing>;

public class GlobalMembers
{
	public static int f(int q,int x)
	{
		if (q < x)
		{
			int i;
			int k;
			int p;
			int sum;
			k = 0;
			sum = 0;
			p = 0;
			for (i = 2;i <= x / 2;i++)
			{
				if (x % i == 0)
				{
					k = k + 1;
				}
			}
			if (k == 0)
			{
				return 1;
			}
			else
			{
				for (i = 2;i <= Math.sqrt(x);i++)
				{
					if (x % i == 0)
					{
						if (i < q)
						{
							continue;
						}
						else
						{
							sum = sum + f(i, x / i);
						}
					}
				}
				return sum + 1;
				p = 0;
				sum = 0;
			}
		}
		else
		{
			if (q == x)
			{
				return 1;
			}
			else
			{
			return 0;
			}
		}
	}




	//???
	public static int Main()
	{
		int n;
		int i;
		int x;
		int sum;
		int p;
		p = 0;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			sum = f(2, x);
			System.out.printf("%d\n",sum);
		}

		return 0;
	}
}

