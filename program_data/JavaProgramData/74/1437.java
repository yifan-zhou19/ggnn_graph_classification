package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		int d = 0;
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
		for (i = m;i <= n;i++)
		{
			for (a = i,b = 0,c = 0;a != 0;a = a / 10)
			{
				b = b * 10 + a % 10;
			}
			if (b == i)
			{
				for (j = 2;j <= Math.sqrt(b);j++)
				{
					if (b % j == 0)
					{
						c = 1;
						break;
					}
				}
				if (c != 1)
				{
					System.out.printf("%d",i);
					d = 1;
					break;
				}
			}
		}
		if (d == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = i + 1;i <= n;i++)
			{
			for (a = i,b = 0,c = 0;a != 0;a = a / 10)
			{
				b = b * 10 + a % 10;
			}
			if (b == i)
			{
				for (j = 2;j <= Math.sqrt(b);j++)
				{
					if (b % j == 0)
					{
						c = 1;
						break;
					}
				}
				if (c != 1)
				{
					System.out.printf(",%d",i);
				}
			}
			}
		}
		return 0;
	}


}

