package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 6;
		int a;
		int d;
		int m;
		int p;
		int q;
		int r;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;i <= n;i = i + 2)
		{

			for (a = 3;a <= i / 2;a = a + 2)
			{
				m = a;
				d = i - a;
				r = 0;
				s = 0;
				for (p = 3;p <= (m / 2);p = p + 2)
				{
				if (m % p == 0)
				{
					r = 1;
				}
				}

				for (q = 3;q <= (Math.sqrt(d));q = q + 2)
				{
				if (d % q == 0)
				{
					s = 1;
				}
				}


				if (r == 0 && s == 0)
				{
					break;
				}
			}
			System.out.printf("%d=%d+%d\n",i,m,d);
		}
	}


}

