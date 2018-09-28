package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int a;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;)
		{
			for (j = 2;j <= i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				a = m - i;
				for (j = 2;j <= a;j++)
				{
					if (a % j == 0)
					{
						break;
					}
				}
				if (j == a)
				{
					System.out.printf("%d %d\n",i,a);
				}
			}
			i = i + 2;
		}
		return 0;
	}


}

