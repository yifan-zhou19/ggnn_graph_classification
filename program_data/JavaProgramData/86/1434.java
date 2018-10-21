package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int p;
		int t;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[200];
		int[] sz1 = new int[10000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				sz1[i] = 60;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[j] = Integer.parseInt(tempVar3);
					}
				}
				p = sz[m - 1] + (m - 1) * 3;
				t = sz[m - 2] + (m - 2) * 3;
				q = sz[m - 3] + (m - 3) * 3;
				if (p <= 57)
				{
					sz1[i] = 60 - 3 * m;
				}
				else if (p <= 60 && p>57)
				{
					sz1[i] = sz[m - 1];
				}
				else if (p > 60)
				{
					if (t <= 57)
					{
						sz1[i] = 60 - 3 * (m - 1);
					}
					else if (t <= 60 && t>57)
					{
						sz1[i] = sz[m - 2];
					}
					else if (t > 60)
					{
						if (q <= 57)
						{
							sz1[i] = 60 - 3 * (m - 2);
						}
						else if (q <= 60 && q>57)
						{
							sz1[i] = sz[m - 3];
						}
					}
				}
				'\n';
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d\n",sz1[i]);
		}
		System.out.printf("%d",sz1[n - 1]);
		return 0;
	}

}

