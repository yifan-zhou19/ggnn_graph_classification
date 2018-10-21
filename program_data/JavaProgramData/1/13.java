package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int x,int m);
		int k;
		int i;
		int j;
		int n;
		int sum = 0;
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
				k = Integer.parseInt(tempVar2);
			}
			for (j = 2;j <= k;j++)
			{
				if (k % j == 0)
				{
					sum += f(k, j);
				}
			}
			System.out.printf("%d\n",sum);
			sum = 0;
		}
	}

	public static int f(int x,int m)
	{
		int i;
		int sum = 0;
		if (m == x)
		{
			sum = 1;
		}
		else
		{
			x = x / m;
			for (i = m;i <= x;i++)
			{
				if (x % i == 0)
				{
					sum += f(x, i);
				}
			}
		}
		return sum;
	}
}

