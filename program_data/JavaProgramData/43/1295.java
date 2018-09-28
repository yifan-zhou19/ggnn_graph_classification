package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= m / 2;a += 2)
		{
			for (i = 3;i <= a;i += 2)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i < a)
			{
				continue;
			}
			else
			{
				b = m - a;
				for (i = 3;i <= b;i += 2)
				{
					if (b % i == 0)
					{
						break;
					}
				}
				if (i == b)
				{
					System.out.printf("%d %d\n",a,b);
				}
			}
		}
		return 0;
	}
}

