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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x > 9999)
		{
			e = x / 10000;
		d = x % 10000 / 1000;
		c = x % 10000 % 1000 / 100;
			 b = x % 10000 % 1000 % 100 / 10;
		a = x % 10000 % 1000 % 100 % 10;
		System.out.printf("%d%d%d%d%d\n",a,b,c,d,e);
		}
		else
		{
			if (x > 999)
			{
				d = x / 1000;
			c = x % 1000 / 100;
			 b = x % 1000 % 100 / 10;
			a = x % 1000 % 100 % 10;
			System.out.printf("%d%d%d%d\n",a,b,c,d);
			}
			else
			{
			  if (x > 99)
			  {
			  c = x / 100;
			  b = x % 100 / 10;
			  a = x % 100 % 10;
			  System.out.printf("%d%d%d\n",a,b,c);
			  }
			  else
			  {
				if (x > 9)
				{
				b = x / 10;
				a = x % 10;
				System.out.printf("%d%d\n",a,b);
				}
				else
				{
					System.out.printf("%d\n",x);
				}
			  }
			}
		}
	}
}

