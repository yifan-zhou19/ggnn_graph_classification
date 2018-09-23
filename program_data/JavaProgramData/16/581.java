package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 1000;
		b = x / 100 % 10;
		c = x / 10 % 10;
		d = x % 10;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.printf("%d",d);
				}
				else
				{
					System.out.printf("%d%d",d,c);
				}
			}
			else
			{
				System.out.printf("%d%d%d",d,c,b);
			}
		}
		else
		{
			System.out.printf("%d%d%d%d",d,c,b,a);
		}
	}


}

