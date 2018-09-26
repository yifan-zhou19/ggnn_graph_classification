package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int i;
		int j;
		int b;
		int p;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= a / 2;i++)
		{
			j = 1;
			for (n = 2;n < i;n++)
			{
				if (i % n == 0)
				{
					j = 0;
				}
			}
			 if (j != 0)
			 {
				b = a - i;
				x = 1;
				for (p = 2;p < b;p++)
				{
					if (b % p == 0)
					{
						x = 0;
					}
				}
				if (x != 0)
				{
					System.out.printf("%d %d\n",i,b);
				}
			 }
		}
		return 0;
	}

}

