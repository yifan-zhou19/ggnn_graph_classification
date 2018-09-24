package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int i;
		int j;
		int b;
		int su;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i += 2)
		{
			su = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					su = 0;
				}
			}
			if (su == 1)
			{
				b = m - i;
				for (j = 2;j < b;j++)
				{
					if (b % j == 0)
					{
						su = 0;
					}
				}
				if (su == 1)
				{
					System.out.printf("%d %d\n",i,b);
				}
			}
		}
	}


}

