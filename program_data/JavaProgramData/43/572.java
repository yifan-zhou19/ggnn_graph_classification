package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++,i++)
		{
			for (k = 2;k < i;k++)
			{
				if (i % k == 0)
				{
					break;
				}
			}
			if (k < i)
			{
				continue;
			}
			else
			{
				j = m - i;
				for (l = 2;l < j;l++)
				{
					if (j % l == 0)
					{
						break;
					}
				}
				if (l >= j)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
	}
}

