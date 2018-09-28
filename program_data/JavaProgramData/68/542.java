package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a = 6;
		int b = 3;
		int i;
		int j;
		int k;
		int l;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (a <= n)
		{
			i = 3;
			System.out.printf("%ld=",a);
			while (i <= a / 2)
			{
				j = 3;
				d = 3;
				k = 0;
				l = 0;
				while (j <= Math.sqrt(i))
				{
					if ((i % j) == 0)
					{
						k++;
					}
					j = j + 2;
				}
				if (k == 0)
				{
					c = a - i;
				while (d <= Math.sqrt(c))
				{
					if ((c % d) == 0)
					{
						l++;
					}
					d = d + 2;
				}
				if (l == 0)
				{
					System.out.printf("%ld+%ld\n",i,c);
					break;
				}
				}
				i = i + 2;
			}
			a = a + 2;
		}
	}

}

