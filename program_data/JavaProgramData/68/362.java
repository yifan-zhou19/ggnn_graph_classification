package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int q;
		int j;
		int k;
		int l;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 6;
		while (i <= n)
		{
			m = 3;
			q = 1;
			while ((m <= (i / 2)) && (q == 1))
			{
				j = 2;
				k = 1;
				while ((j <= Math.sqrt(m)) && (k == 1))
				{
					if (m % j == 0)
					{
						k = 0;
					}
					j++;
				}
				if (k == 1)
				{
					l = i - m;
					j = 2;
					r = 1;
					while ((j <= Math.sqrt(l)) && (r == 1))
					{
						if (l % j == 0)
						{
							r = 0;
						}
						j++;
					}
					if (r == 1)
					{
						q = 0;
						System.out.printf("%d=%d+%d\n",i,m,l);
					}
				}
				m++;
			}
			i = i + 2;
		}
	}



}

