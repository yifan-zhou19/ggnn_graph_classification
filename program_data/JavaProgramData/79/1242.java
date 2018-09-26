package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[300];
		int n;
		int m;
		int i;
		int j;
		int c;
		int p;
		for (j = 0;;j++)
		{
			p = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				sz[i] = i + 1;
			}
			for (i = 0;i < n;i++)
			{
				c = 0;
				while (c < m)
				{
					while (sz[p] == 0)
					{
					p = (p + 1) % n;
					}
					c++;
					p = (p + 1) % n;
				}
				p--;
				if (p < 0)
				{
					p = n - 1;
				}
				if (i == n - 1)
				{
					System.out.printf("%d\n",sz[p]);
				}
				sz[p] = 0;
			}
		}
		  return 0;
	}






}

