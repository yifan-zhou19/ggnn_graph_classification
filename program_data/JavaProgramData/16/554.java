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
		int e;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x % 10;
		b = (x / 10) % 10;
		c = (x / 100) % 10;
		d = (x / 1000) % 10;
		e = (x / 10000) % 10;
		if (e == 0)
		{
			if (d == 0)
			{
				if (c == 0)
				{
					if (b == 0)
					{
						r = a;
						System.out.printf("%d\n",r);
					}
					else
					{
							r = a * 10 + b;
							System.out.printf("%02d\n",r);
					}
				}
				else
				{
						r = a * 100 + b * 10 + c;
						System.out.printf("%03d\n",r);
				}
			}
			 else
			 {
					 r = a * 1000 + b * 100 + c * 10 + d;
					 System.out.printf("%04d\n",r);
			 }
		}
		else
		{
				r = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
				System.out.printf("%05d\n",r);
		}
		return 0;
	}
}

