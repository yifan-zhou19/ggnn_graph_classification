package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 2;a <= m;a++)
		{
			for (b = a;b <= m;b++)
			{
				if (a + b == m)
				{
					c = 1;
				for (i = 2;i <= Math.sqrt(a);i++)

				{
						if (a % i == 0)
						{
						c = 0;
						}
				}
				d = 1;
				for (j = 2;j <= Math.sqrt(b);j++)
				{
						if (b % j == 0)
						{
						d = 0;
						}
				}


		if (c != 0)
		{
		if (d != 0)
		{
			System.out.printf("%d %d\n",a,b);
		}
		}


				}
			}
		}
		return 0;
	}
}

