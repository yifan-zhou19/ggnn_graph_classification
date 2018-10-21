package <missing>;

public class GlobalMembers
{
	public static int huiwen(int a)
	{
		int b = 0;
		int i = 0;
		int l = 1;
		int c = 1;
		for (l = 0;l < 12;l++)
		{
			if ((a / c) == 0)
			{
			break;
			}
			c = c * 10;
		}
		c = a;
		for (i = 1;i <= l;i++)
		{
			b = b * 10;
			b = b + (c % (10));
			c = (c / 10);
		}
		if (a == b)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int ss(int a)
	{
		int i = 2;
		for (i = 2;i <= (a / 2);i++)
		{
			if ((a % i) == 0)
			{
			return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i = 0;
		int k = 0;
		for (i = m;i <= n;i++)
		{
			if (i != 1)
			{
			if (huiwen(i) != 0)
			{
				if (ss(i) != 0)
				{
					k = k + 1;
					if (k != 1)
					{
					System.out.printf(",%d",i);
					}
					else
					{
					System.out.printf("%d",i);
					}
				}
			}
			}
		}
		if (k == 0)
		{
		System.out.print("no");
		}
		return 0;
	}

}

