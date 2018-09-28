package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int su = int x;
		int n;
		int a;
		int b;
		int c;
		int d;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2)
		{
		 for (a = 2;a < k / 2 + 1;a++)
		 {
			b = k - a;
			c = su(a);
			d = su(b);
			if (c == 0 && d == 0)
			{
				break;
			}
		 }
		 System.out.printf("%d=%d+%d\n",k,a,b);
		}

	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static su(int x)
	{
		int i;
		int j = 0;
		int z;
		if (x == 2)
		{
			z = 0;
		}
		else
		{
			for (i = 2;i < Math.sqrt(x) + 1;i++)
			{
				if (x % i == 0)
				{
					j = j + 1;
				}
			}
			if (j == 0)
			{
				z = 0;
			}
			else
			{
				z = 1;
			}

		}
		return (z);
	}
}

