package <missing>;

public class GlobalMembers
{
	public static int total;
	public static int p;
	public static void part(int y)
	{
		int i2;
		int up;
		if (y == 1)
		{
			return;
		}
		up = (int)Math.sqrt(y);
		for (i2 = 2;i2 <= up;i2++)
		{
			if (p <= i2)
			{
					if (y % i2 == 0)
					{
						total++;
						p = i2;
						part(y / i2);
						p = 0;
					}
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			total = 0;
			p = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			part(a);
			System.out.printf("%d\n",total + 1);
		}
		return 0;
	}

}

