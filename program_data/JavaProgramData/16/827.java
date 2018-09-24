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
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 1000;
		b = (n / 100) % 10;
		c = (n / 10) % 10;
		d = n % 10;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d\n",d,c,b,a);
		}
		else if (b)
		{
				System.out.printf("%d%d%d\n",d,c,b);
		}
		else if (c)
		{
			System.out.printf("%d%d\n",d,c);
		}
		else
		{
			System.out.printf("%d\n",d);
		}
	}

}

