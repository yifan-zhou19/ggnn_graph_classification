package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 3;
		int c;
		int n;
		int i;
		int j;
		int l;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 6;a <= n;a = a + 2)
		{
			for (b = 3;b <= a;b = b + 2)
			{
			x = (int)Math.sqrt(b);
			for (i = 2;i <= x;i++)
			{
				if (b % i == 0)
				{
					break;
				}
			}
				if (i >= x + 1)
				{
					c = a - b;
					y = (int)Math.sqrt(c);
					for (j = 2;j <= y;j++)
					{
						if (c % j == 0)
						{
							break;
						}
					}
						if (j >= y + 1)
						{
							System.out.printf("%d=%d+%d\n",a,b,c);
							break;
						}
				}
			}
		}
	}
}

