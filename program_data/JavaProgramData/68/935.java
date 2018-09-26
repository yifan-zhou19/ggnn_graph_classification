package <missing>;

public class GlobalMembers
{
	public static int sushu(int p)
	{
		int i;
		int k = 0;
		for (i = 2;i <= Math.sqrt(p);i++)
		{
			if (p % i == 0)
			{
				k++;
			}
		}
		if (k > 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int p;
		int q;
		n = 6;
		while (n <= m)
		{
			for (a = 2;a <= n / 2;a++)
			{
				b = n - a;
				if (a != 2)
				{
					p = a % 2;
				}
				else
				{
					p = 1;
				}
				q = b % 2;
				if (p != 0 && q != 0)
				{
					if (sushu(a) != 0 && sushu(b) != 0)
					{
						System.out.printf("%d=%d+%d\n",n,a,b);
						break;
					}
				}
			}
			n = n + 2;
		}
		return 0;
	}
}

