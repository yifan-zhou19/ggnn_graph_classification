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
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 1000;
		c = a % 1000;
		d = c / 100;
		e = a % 100;
		f = e / 10;
		g = a % 10;

		if (b == 0)
		{
			if (d == 0)
			{
				if (f == 0)
				{
					System.out.printf("%d",g);
				}
				else
				{
					System.out.printf("%d%d",g,f);
				}
			}
			else
			{
				System.out.printf("%d%d%d",g,f,d);
			}
		}
		else
		{
			System.out.printf("%d%d%d%d",g,f,d,b);
		}
		return 0;
	}

}

