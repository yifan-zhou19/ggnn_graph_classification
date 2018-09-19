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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 10;
		c = (a % 100 - b) / 10;
		d = (a % 1000 - b - c * 10) / 100;
		e = a / 1000;
		if (e == 0)
		{
			if (d == 0)
			{
				if (c == 0)
				{
					System.out.printf("%d",b);
				}
				else
				{
					System.out.printf("%d%d",b,c);
				}
			}
			else
			{
				System.out.printf("%d%d%d",b,c,d);
			}
		}
		else
		{
			System.out.printf("%d%d%d%d",b,c,d,e);
		}
		return 0;
	}
}

