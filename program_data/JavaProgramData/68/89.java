package <missing>;

public class GlobalMembers
{
	public static int ss(int n)
	{
		int i;
		int s;
		s = 0;
		i = 2;
		if (n == 2 || n == 3)
		{
			return 1;
		}

		do
		{
			i++;
		if (n % i == 0)
		{
			s++;
		}
		} while (i * i < n);
		if (s == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int m;
		int k;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= m;k = k + 2)
		{
			for (j = 3;j <= k / 2;j += 2)
			{
				if (ss(j) != 0)
				{
					p = k - j;
					if (ss(p) != 0)
					{
						System.out.printf("%d=%d+%d\n",k,j,p);
						break;
					}
				}
			}
		}
	return 0;
	}
}

