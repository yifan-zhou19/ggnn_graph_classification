package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int a = 2;
		int b;
		int m;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		s = m / 2;
		while (a <= s)
		{
			b = m - a;
			int i = 2;
			int x;
			int z;
			int y = 1;
			int j = 2;
			int k;
			int l;
			int h = 1;
			while (i < a)
			{
				x = a - a / i * i;
				if (x == 0)
				{
					z = 0;
				}
				else
				{
					z = 1;
				}
				y = y * z;
				i++;
			}

			while (j < b)
			{
				k = b - (b / j) * j;
				if (k == 0)
				{
					l = 0;
				}
				else
				{
					l = 1;
				}
				h = h * l;
				j++;
			}
			if (y == 1)
			{
				if (h == 1)
				{
				System.out.printf("%d %d\n",a,b);
				}
			}
			a++;
		}
	return 0;
	}


}

