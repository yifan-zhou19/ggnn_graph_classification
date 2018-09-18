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
		int h;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 10;
		c = a / 10;
		d = ((a - b) % 100) / 10;
		e = a / 100;
		f = ((a - b - d * 10) % 1000) / 100;
		g = a / 1000;
		h = ((a - b - d * 10 - f * 100) % 10000) / 1000;
		i = a / 10000;
		if (c < 1)
		{
			System.out.printf("%d\n",a);
		}
		else
		{
			if (e < 1)
			{
				System.out.printf("%d%d\n",b,d);
			}
			else
			{
				if (g < 1)
				{
					System.out.printf("%d%d%d\n",b,d,f);
				}
				else
				{
					System.out.printf("%d%d%d%d\n",b,d,f,h);
				}
			}
		}
	}
}

