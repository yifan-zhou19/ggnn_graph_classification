package <missing>;

public class GlobalMembers
{
	public static int z(int n)
	{
		int i;
		int t;
		int r;
		t = 0;
		r = (int)Math.sqrt(n) + 1;
		for (i = 3;i <= r;i = i + 2)
		{
			if (n % i == 0)
			{
				t++;
				break;
			}
		}
		if (t == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			if (z(i) != 0)
			{
				j = m - i;
				if (z(j) != 0)
				{
				System.out.printf("%d %d\n",i,j);
				}

			}
		}

		return 0;
	}


}

