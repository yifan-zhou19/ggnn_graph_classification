package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 10000;
		b = (x - a * 10000) / 1000;
		c = (x - a * 10000 - b * 1000) / 100;
		d = (x - a * 10000 - b * 1000 - c * 100) / 10;
		e = x - a * 10000 - b * 1000 - c * 100 - d * 10;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.printf("%d%d\n",e,d);
				}
				else
				{
					System.out.printf("%d%d%d\n",e,d,c);
				}
			}
			else
			{
				System.out.printf("%d%d%d%d\n",e,d,c,b);
			}
		}
		else
		{
			System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		}
	}
}

