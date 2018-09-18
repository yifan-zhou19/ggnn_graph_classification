package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 10;
		e = n - a;
		f = e / 10;
			 b = f % 10;
		g = n - 10 * b - a;
		h = g / 100;
		c = h % 10;
			 i = n - 100 * c - 10 * b - a;
		j = i / 1000;
		d = j % 10;
		if (d == 0)
		{
			if (c == 0)
			{
				if (b == 0)
				{
					System.out.printf("%d",a);
				}
				else
				{
					System.out.printf("%d%d",a,b);
				}
			}
			else
			{
				System.out.printf("%d%d%d",a,b,c);
			}
		}
		else
		{
			System.out.printf("%d%d%d%d",a,b,c,d);
		}
		return 0;
	}

}

