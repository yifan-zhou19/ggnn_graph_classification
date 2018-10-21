package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int k;
		int p;
		int m;
		int i;
		int q;
		int sign = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (k = 6;k <= n;k = k + 2)
		{
			for (p = 3;p <= k / 2;p = p + 2)
			{
				sign = 1;
				m = (int)Math.sqrt((double)p);
				for (i = 3;i <= m;i = i + 2)
				{
					if (p % i == 0)
					{
						sign = 0;
						break;
					}
				}

				if (sign == 0)
				{
					continue;
				}

				q = k - p;
				m = (int)Math.sqrt((double)q);
				for (i = 3;i <= m;i = i + 2)
				{
					if (q % i == 0)
					{
						sign = 0;
						break;
					}
				}
				if (sign == 1)
				{
					System.out.printf("%d=%d+%d\n",k,p,q);
					break;
				}
			}

		}

	}
}

