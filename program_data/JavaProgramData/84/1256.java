package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
				b = a;
				a = 0;
			}
			else
			{
				if (a > b)
				{
					c = b;
					b = a;
				}
				else
				{
					b = b;
					if (a >= c)
					{
						c = a;
					}
					else
					{
						c = c;
					}
				}
			}
			i++;
		}
		System.out.printf("%d\n%d\n",b,c);
		return 0;
	}

}

