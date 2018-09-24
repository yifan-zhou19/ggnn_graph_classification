package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m >= 6 && m <= 10000 && m % 2 == 0)
		{
			for (a = 2;a <= m;a++)
			{
				for (b = 2;b <= m;b++)
				{
			if (a % 2 != 0 && b % 2 != 0 && a <= b)
			{
			if (m == a + b)
			{
				for (i = 2;i < a;i++)
				{
					if (a % i == 0)
					{
					break;
					}
				}
				if (i == a)
				{
					  for (j = 2;j < b;j++)
					  {
					if (b % j == 0)
					{
					break;
					}
					  }
					  if (j == b)
					  {
						  System.out.printf("%d %d\n",a,b);
					  }
				}
			}
			}
				}
			}
		}
			return 0;
	}
}

