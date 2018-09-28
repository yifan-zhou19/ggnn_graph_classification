package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int a = 3;
		int b;
		int i;
		int j;
		int z1;
		int z2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (a <= (m / 2))
		{
			z1 = 1;
			for (i = 2;i <= (int)(Math.sqrt(a));i++)
			{
				if (a % i == 0)
				{
					z1 *= 0;
				}
				else
				{
					z1 *= 1;
				}
			}
			if (z1 == 1)
			{
				b = m - a;
				z2 = 1;
				for (j = 2;j <= (int)(Math.sqrt(b));j++)
				{
					if (b % j == 0)
					{
						z2 *= 0;
					}
					else
					{
						z2 *= 1;
					}
				}
				if (z2 == 1)
				{
					if (a + b == m)
					{
						System.out.printf("%d %d\n",a,b);
					}
				}
			}
			a = a + 2;
		}
	}


}

