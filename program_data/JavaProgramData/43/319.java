package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int n;
		int a = 0;
		int b = 0;
		for (int i = 3;i <= m / 2;i = i + 2)
		{
				n = m - i;
				for (int j = 3;j <= i;j++)
				{
						if (i % j == 0)
						{
								 a++;
						}
				}
				for (int k = 3;k <= n;k++)
				{
						if (n % k == 0)
						{
								 b++;
						}
				}
				if (a == 1 && b == 1)
				{
							   System.out.printf("%d %d\n",i,n);
				}
				a = 0;
				b = 0;

		}

		int y;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

