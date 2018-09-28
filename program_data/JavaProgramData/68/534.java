package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 6;n <= m;n += 2)
		{
			for (a = 3;a <= n / 2;a += 2)
			{
			for (i = 3;i <= Math.sqrt((float)a);i += 2)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i <= Math.sqrt((float)a))
			{
				continue;
			}
			else
			{
				for (j = 3,b = n - a;j <= Math.sqrt((float)b);j += 2)
				{
					if (b % j == 0)
					{
						break;
					}
				}
			}
			if (j <= Math.sqrt((float)b))
			{
				continue;
			}
			else
			{
				break;
			}
			}
			System.out.printf("%d=%d+%d\n",n,a,b);
		}
	}
}

