package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int r;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else
			{
				m = i;
				while (m != 0)
				{
					r = m % 10;
					m = m / 10;
					if (r == 7)
					{
						break;
					}
				}
				if (m != 0 || r == 7)
				{
					continue;
				}
				else
				{ //printf("i=%d\n",i);
				sum = sum + i * i;
				}
			}
		}
		System.out.printf("%d\n",sum);
	}

}

