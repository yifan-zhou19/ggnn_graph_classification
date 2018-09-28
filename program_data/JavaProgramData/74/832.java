package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int d;
		int c;
		int i;
		int k;
		int j;
		int l;
		int y;
		int q;
		int m;
		double x;
		double e;
		double f;
		double h;
		double g;
		double z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		q = 1;
		m = 0;
		for (c = a;c <= b;c++)
		{
		e = 1;
		 x = 10;
		 f = 0;
		 h = 0;
		 l = c;
		 k = c;
		 y = 1;
		while (true)
		{
			d = (l - l % 10) / 10;
			if (d >= 10)
			{
				l = d;
			}
			else
			{
				break;
			}
			e = e+1;
		}

		while (f <= e)
		{
			   j = k % 10;
		   k = (k - j) / 10;
		   g = e - f;
		   h = h + Math.pow(x,g) * j;
		   f = f + 1;
		}
	z = Math.sqrt(c);
		for (i = 2;i <= z;i++)
		{
			if (c % i == 0)
			{
		y = 0;
		break;
			}
		}
		  if (i > z)
		  {
		  y = 1;
		  }
	if (y == 1 && h == c && m == 1)
	{
	System.out.printf(",%d",c);
	}
	if (y == 1 && h == c && m == 0)
	{
		System.out.printf("%d",c);
	q = 0;
	m = 1;
	}

		}
	if (q != 0)
	{
	System.out.print("no\n");
	}

			   return 0;
	}



}

