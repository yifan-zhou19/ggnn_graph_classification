package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int i;
		int j;
		int k;
		int b;
		int c;
		int d;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m / 2;
		for (i = 3;i <= a;i = i + 2)
		{
			for (j = 3;j <= Math.sqrt(i);j = j + 2)
			{
				b = i % j;
				if (b == 0)
				{
					e++;
					break;
				}
			}
			c = m - i;
			for (k = 3;k <= Math.sqrt(c);k = k + 2)
			{
				d = c % k;
				if (d == 0)
				{
					e++;
					break;
				}
			}
			if (e == 0)
			{
			System.out.printf("%d %d\n",i,c);
			}
			e = 0;
		}
		return 0;
	}


}

