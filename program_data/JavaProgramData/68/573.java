package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t;
		int i;
		int j;
		int k;
		int p;
		int q;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m = m + 2)
		{
			System.out.printf("%ld=",m);
			for (i = 3;i < m;i = i + 2)
			{
				t = m - i;
				a = (int)Math.sqrt(i);
				b = (int)Math.sqrt(t);
				for (j = 1;j <= a;j = j + 2)
				{
					if (i % j == 0 && j != 1)
					{
						p = 1;
						break;
					}
					else
					{
						p = 0;
					}
				}
				for (k = 1;k <= b;k = k + 2)
				{
					if (t % k == 0 && k != 1)
					{
						q = 1;
						break;
					}
					else
					{
						q = 0;
					}
				}
				if (p == 0 && q == 0)
				{
					System.out.printf("%ld+%ld\n",i,t);
					break;
				}
			}
		}
	}





}

