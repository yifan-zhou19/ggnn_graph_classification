package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int c;
		int o;
		int p;
		int q;
		int r;
		int yl;
		int j1;
		int m;
		int[] tj = new int[1000];
		int[] qw = new int[1000];
		for (i = 0;;i++)
		{
			for (m = 0;m <= 999;m++)
			{
			tj[m] = 0;
			qw[m] = 0;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			c = 0;
			o = n - 1;
			p = 0;
			q = n - 1;
			r = 0;
			yl = 0;
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tj[j] = Integer.parseInt(tempVar2);
				}
			}
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qw[j] = Integer.parseInt(tempVar3);
				}
			}
			for (k = 0;k <= n - 2;k++)
			{
				for (l = k + 1;l <= n - 1;l++)
				{
					if (tj[k] < tj[l])
					{
						c = tj[k];
						tj[k] = tj[l];
						tj[l] = c;
						c = 0;
					}
				}
			}
			for (k = 0;k <= n - 2;k++)
			{
				for (l = k + 1;l <= n - 1;l++)
				{
					if (qw[k] < qw[l])
					{
						c = qw[k];
						qw[k] = qw[l];
						qw[l] = c;
						c = 0;
					}
				}
			}
			for (j1 = 0;j1 <= n - 1;j1++)
			{
				if (tj[o] > qw[q])
				{
					yl = yl + 200;
					o = o - 1;
					q = q - 1;
				}
				else if (tj[o] < qw[q])
				{
					yl = yl - 200;
					o = o - 1;
					r = r + 1;
				}
				else if (tj[o] == qw[q])
				{
					if (tj[p] > qw[r])
					{
						yl = yl + 200;
						p = p + 1;
						r = r + 1;
					}
					else if (tj[p] == qw[r])
					{
						if (tj[o] < qw[r])
						{
							yl = yl - 200;
							o = o - 1;
							r = r + 1;
						}
						else if (tj[o] == qw[r])
						{
							o = o - 1;
							r = r + 1;
						}
					}
					else if (tj[p] < qw[r])
					{
						yl = yl - 200;
						o = o - 1;
						r = r + 1;
					}
				}
			}
			System.out.printf("%d\n",yl);
		}
		return 0;
	}
}

