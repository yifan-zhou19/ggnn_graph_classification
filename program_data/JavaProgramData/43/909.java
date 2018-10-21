package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int x;
		int y;
		int a;
		int b;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (x = 3;x <= m / 2;x++,x++)
		{
			a = Math.sqrt(x * 1.0);
			for (i = 3;i <= a;i++,i++)
			{
				if (x % i == 0)
				{
					break;
				}
			}
			if (i > a || x == 3 || x == 5)
			{
				y = m - x;
				b = Math.sqrt(y * 1.0);
				for (j = 3;j <= b;j++,j++)
				{
					if (y % j == 0)
					{
						break;
					}
				}
				if (j > b || y == 3 || y == 5)
				{
					System.out.printf("%d %d\n",x,y);
				}
			}
		}
	}
}

