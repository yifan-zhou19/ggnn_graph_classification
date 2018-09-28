package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int f;
		int g;
		int h;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (h = 6;h <= n;h += 2)
		{
		for (a = 3;a < h;a += 2)
		{
			c = (int)Math.sqrt(a);
			for (d = 2;d <= c;d++)
			{
				if (a % d == 0)
				{
					break;
				}
			}
			if (d <= c)
			{
				continue;
				a += 2;
			}
			b = h - a;
			g = (int)Math.sqrt(b);
			for (f = 2;f <= g;f++)
			{
				if (b % f == 0)
				{
				break;
				}
			}
			if (f > g)
			{
			   System.out.printf("%d=%d+%d\n",h,a,b);
			   break;
			}
		}
		}
	}

}

