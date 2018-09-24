package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int n;
		int sqrti;
		int sqrtn;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m >= 6 && m <= 10000 && m % 2 == 0)
		{
			for (i = 3; i <= m / 2; i += 2)
			{
				sqrti = (int)Math.sqrt(i);
				for (j = 3; j <= sqrti; j += 2)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j > sqrti)
				{
					n = m - i;
					sqrtn = (int)Math.sqrt(n);
					for (j = 3; j <= sqrtn; j += 2)
					{
						if (n % j == 0)
						{
							break;
						}
					}
					if (j > sqrtn)
					{
						System.out.printf("%d %d\n",i,n);
					}
				}
			}
		}
		return 0;
	}
}

