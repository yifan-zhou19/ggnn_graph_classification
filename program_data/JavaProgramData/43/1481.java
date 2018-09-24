package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int i;
		int b;
		int h = 1;
		int g = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= (m / 2);a += 2)
		{
			for (i = 2;i < a;i++)
			{
				if (a % i == 0)
				{
					h = 0;
				}
			}
			for (b = 2;b < (m - a);b++)
			{
				if ((m - a) % b == 0)
				{
					g = 0;
				}
			}
			if (h == 1 && g == 1)
			{
				System.out.printf("%d %d\n",a,m - a);
			}
			h = 1;
			g = 1;
		}
		return 0;
	}



}

