package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int i1;
		int j;
		int j1;
		int k;
		int a;
		int p;
		double m;
		double m1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 6;a <= n;a = a + 2)
		{
			for (i = 3;i <= a;)
			{
				i1 = i;
				m = Math.sqrt(i);
				for (p = 3;p <= m;p = p + 2)
				{
					if (i % p == 0)
					{
						i = i / p;
					}
				}
				if (i == i1)
				{
					j = j1 = a - i;
					m1 = Math.sqrt(j);
					for (k = 3;k <= m1;k = k + 2)
					{
						if (j % k == 0)
						{
						j = j / k;
						}
					}
					if (j == j1)
					{
							System.out.printf("%d=%d+%d\n",a,i,j);
							break;
					}
					else
					{
						i = i + 2;
					}
				}
				else
				{
					i = i1 + 2;
				}
			}
		}
	}
}

