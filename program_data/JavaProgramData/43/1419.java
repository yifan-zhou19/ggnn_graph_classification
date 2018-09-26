package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int j;
		int i;
		int a;
		int b;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			e = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					e++;
				}
			}
			if (e == 0)
			{
					a = i;
					b = m - a;
					e = 0;
					for (j = 2;j < b;j++)
					{
						if (b % j == 0)
						{
							e++;
						}
					}
					if (e == 0)
					{
						System.out.printf("%d %d\n",a,b);
					}
			}
		}
	}

}

