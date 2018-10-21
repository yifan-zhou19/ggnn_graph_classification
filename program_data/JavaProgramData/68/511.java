package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			System.out.printf("%d=",i);
			for (a = 3;a <= n / 2;a += 2)
			{
				c = 0;
				d = 0;
				b = i - a;
				for (j = 3;j <= Math.sqrt(a);j += 2)
				{
					if (a % j != 0)
					{
						c++;
					}
					d++;
				}
				if (c == d)
				{
					c = 0;
					d = 0;
					for (j = 3;j <= Math.sqrt(b);j += 2)
					{
						if (b % j != 0)
						{
							c++;
						}
						d++;
					}
					if (c == d)
					{
						System.out.printf("%d+%d\n",a,b);
						break;
					}
				}
			}
		}
	}
}

