package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int g;
		int s;
		int b;
		int q;
		int o = 0;
		int p = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 10000)
		{
			System.out.printf("%d%d%d%d%d\n",o,o,o,o,p);
		}
		{
			if (a <= 10)
			{
				System.out.printf("%d\n",a);
			}
			else if (a < 100)
			{
				s = (a % 100) / 10;
				g = a % 10;
				System.out.printf("%d%d\n",g,s);
			}
			else if (a < 1000)
			{
				b = (a % 1000) / 100;
				s = (a % 100) / 10;
				g = a % 10;
				System.out.printf("%d%d%d\n",g,s,b);
			}
			else if (a < 10000)
			{
				q = (a % 10000) / 1000;
				b = (a % 1000) / 100;
				s = (a % 100) / 10;
				g = a % 10;
				System.out.printf("%d%d%d%d\n",g,s,b,q);
			}
	}
		return 0;
	}
}

