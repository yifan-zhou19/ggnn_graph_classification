package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int x;
		int y;
		int i;
		int j;
		int p1;
		int p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= (m / 2);a = a + 2)
		{
			b = m - a;
			p1 = 1;
			p2 = 1;
			for (i = 2;i < a;i++)
			{
				x = a % i;
				if (x == 0)
				{
					p1 = 0;
					break;
				}
			}
			for (j = 2;j < b;j++)
			{
				y = b % j;
				if (y == 0)
				{
					p2 = 0;
					break;
				}
			}
			if (p1 != 0 && p2 != 0)
			{
				System.out.printf("%d %d\n",a,b);
			}
		}
		return 0;
	}
}

