package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int s;
		int zs;
		int[] sz = new int[20];
		int[] sj = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				zs = 60;
				System.out.printf("%d\n",zs);
			}
			else
			{
				for (j = 1;j < m + 1;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[j] = Integer.parseInt(tempVar3);
					}
					sj[j] = sz[j] + 3 * j;
				}
				if (sj[m] <= 60)
				{
					zs = 60 - 3 * m;
				}
				else
				{
					if ((sj[m] - 3 <= 60))
					{
						zs = sz[m];
					}
					else
					{
						if (sj[m - 1] <= 60)
						{
							zs = 63 - 3 * m;
						}
						else
						{
							if ((sj[m - 1] - 3) <= 60)
							{
								zs = sz[m - 1];
							}
							else
							{
								zs = 66 - 3 * m;
							}
						}
					}
				}
				System.out.printf("%d\n",zs);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			1 = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

