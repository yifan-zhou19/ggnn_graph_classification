package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int a;
		int b;
		int c;
		int m;
		int e;
		int n;
		int d;
		int f;
		int g;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (c = a;c <= b;c++)
		{
			f = 0;
			if ((c % 10) != 0)
			{
				for (m = 1;m <= 10000000;m = m * 10)
				{
					if ((c % m) == c)
					{
						e = m;
						m = 10000001;
					}
				}
				   for (n = 1;n < e;n = n * 10)
				   {
					d = (c % (10 * n) - c % n) / n;
					f = d * e / (10 * n) + f;
				   }
				if (f == c)
				{
					for (g = 2;g < c;g++)
					{
						if (c % g == 0)
						{
							g = c + 1;
						}
					}
					if (g == c)
					{
						System.out.printf("%d",c);
						h = 1;
						break;
					}
				}
			}
		}
		for (c = c + 1;c <= b;c++)
		{
			f = 0;
			if ((c % 10) != 0)
			{
				for (m = 1;m <= 10000000;m = m * 10)
				{
					if ((c % m) == c)
					{
						e = m;
						m = 10000001;
					}
				}
				   for (n = 1;n < e;n = n * 10)
				   {
					d = (c % (10 * n) - c % n) / n;
					f = d * e / (10 * n) + f;
				   }
				if (f == c)
				{
					for (g = 2;g < c;g++)
					{
						if (c % g == 0)
						{
							g = c + 1;
						}
					}
					if (g == c)
					{
						System.out.printf(",%d",c);
					}
				}
			}
		}
		if (h == 0)
		{
			System.out.print("no");
		}
	}

}

