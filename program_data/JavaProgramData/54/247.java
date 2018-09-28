package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m1;
		int k;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (m1 = 7;;m1++)
		{
			if (m1 % n == k)
			{
				m = m1;
				for (j = 1;j <= n;j++)
				{
					if (j < n)
					{
						m -= k;
						if ((m % n) == 0) //??
						{
							m = m - m / n;
						}
						else
						{
							break;
						}
					}
					else
					{
						m -= k;
						if ((m % n) == 0)
						{
							System.out.printf("%d",m1);
							return 0;
						}
					}
				}

			}
		}
	}
}

