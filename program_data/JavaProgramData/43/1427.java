package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int l;
		float k;
		float p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++,i++)
		{
			k = Math.sqrt(i);
			for (j = 2;j <= k;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}

			p = Math.sqrt(m - i);
			for (l = 2;l <= p;l++)
			{
				if ((m - i) % l == 0)
				{
					break;
				}
			}
			if (j > k && l > p)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}
	}
}

