package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int m;
		int i;
		int n;
		int sq;
		int j;
		int k = 0;
		int s;
		int p;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m;i++)
		{
			s = 0;
			sq = Math.sqrt(i) + 1;
			for (j = 2;j <= sq;j++)
			{
				if (i % j == 0)
				{
					s++;
					break;
				}
				else
				{
					continue;
				}
			}
			if (s == 0)
			{
				a[k] = i;
				k++;
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < k;i++)
		{
			r = 0;
			if (a[i] <= m / 2)
			{
				p = m - a[i];
				for (j = 0;j < k;j++)
				{
					if (p != a[j])
					{
						continue;
					}
					else
					{
						System.out.printf("%d %d\n",a[i],p);
					}
				}
			}
			else
			{
				break;
			}
		}
		return 0;
	}

}

