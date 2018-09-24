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
		int m;
		int n;
		int o;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		m = x / 10000;
		n = x / 1000;
		o = x / 100;
		p = x / 10;
			if (m != 0)
			{
			a = m;
			b = n - 10 * a;
			c = o - 100 * a - 10 * b;
			d = p - 1000 * a - 100 * b - 10 * c;
			e = x % 10;
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
			}
		else
		{
			if (n != 0)
			{
				a = n;
				b = o - 10 * a;
				c = p - 100 * a - 10 * b;
				d = x % 10;
				System.out.printf("%d%d%d%d",d,c,b,a);
			}
			else if (o != 0)
			{
					a = o;
					b = p - 10 * o;
					c = x % 10;
					System.out.printf("%d%d%d",c,b,a);
			}
				else if (p != 0)
				{
						a = p;
						b = x % 10;
						System.out.printf("%d%d",b,a);
				}
				else
				{
				System.out.printf("%d",x);
				}
		}
	}

}

