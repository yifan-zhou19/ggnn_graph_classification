package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int q;
		int p;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= a;i += 2)
		{
			for (p = 3;p <= i / 2;p += 2)
			{
				t = 0;
				for (j = 3;j * j <= p;j += 2)
				{
					if (p % j == 0)
					{
						t = 1;
						break;
					}
				}
				if (t != 0)
				{
					continue;
				}
				q = i - p;
				for (j = 3;j * j <= q;j += 2)
				{
					if (q % j == 0)
					{
						t = 1;
						break;
					}
				}
				if (t == 0)
				{
					System.out.printf("%ld=%ld+%ld\n",i,p,q);
					break;
				}
			}
		}
	}


}

