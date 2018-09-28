package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int p;
		int q;
		int i;
		int j;
		int e;
		int f;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		for (x = 6;x <= y;x = x + 2)
		{
			for (p = 3;p <= x / 2;p++)
			{
			i = Math.sqrt(p);
			for (e = 2;e <= i;e = e+1)
			{
				if (p % e == 0)
				{
					break;
				}
			}
				if (e > i)
				{
					q = x - p;
					j = Math.sqrt(q);
					for (f = 2;f <= j;f = f + 1)
					{
						if (q % f == 0)
						{
							break;
						}
					}
						if (f > j)
						{
							System.out.printf("%d=%d+%d\n",x,p,q);
							break;
						}
				}
			}
		}
	}
}

