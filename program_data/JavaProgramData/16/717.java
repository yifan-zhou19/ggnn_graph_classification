package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Integer.parseInt(tempVar);
		}
		a = (int)z / 10000;
		z = z - a * 10000;
		b = (int)z / 1000;
		z = z - b * 1000;
		c = (int)z / 100;
		z = z - c * 100;
		d = (int)z / 10;
		e = z - d * 10;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					if (d == 0)
					{
						System.out.printf("%d",e);
					}
					else
					{
						System.out.printf("%d%d",e,d);
					}
				}
				else
				{
					System.out.printf("%d%d%d",e,d,c);
				}
			}
			else
			{
				System.out.printf("%d%d%d%d",e,d,c,b);
			}
		}
		else
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		return 0;
	}
}

