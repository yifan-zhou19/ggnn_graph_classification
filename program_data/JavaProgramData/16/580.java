package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		a = t / 10000;
		b = t / 1000 - 10 * a;
		c = t / 100 - 100 * a - 10 * b;
		d = t / 10 - 1000 * a - 100 * b - 10 * c;
		e = t % 10;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else
		{
			if (b != 0)
			{
				System.out.printf("%d%d%d%d",e,d,c,b);
			}
			else
			{
				if (c != 0)
				{
					System.out.printf("%d%d%d",e,d,c);
				}
				else
				{
					if (b != 0)
					{
						System.out.printf("%d%d",e,d);
					}
					else
					{
						System.out.printf("%d",e);
					}
				}
			}
		}
		return 0;
	}

}

