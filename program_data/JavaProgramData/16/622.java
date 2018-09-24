package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 10000;
		c = (a - 10000 * b) / 1000;
		d = (a - 10000 * b - 1000 * c) / 100;
		e = (a - 10000 * b - 1000 * c - 100 * d) / 10;
		f = a - 10000 * b - 1000 * c - 100 * d - 10 * e;
		if (b == 1)
		{
		System.out.printf("%d%d%d%d%d%d",f,e,d,c,b);
		}
		else
		{
			if (c >= 1)
			{
				System.out.printf("%d%d%d%d",f,e,d,c);
			}
			else
			{
				if (d >= 1)
				{
					System.out.printf("%d%d%d",f,e,d);
				}
				else
				{
					if (e >= 1)
					{
						System.out.printf("%d%d",f,e);
					}
					else
					{
						System.out.printf("%d",f);
					}
				}
			}
		}
		return 0;
	}
}

