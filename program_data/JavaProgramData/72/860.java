package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] s = new int[200][200];
		int i;
		int r;
		int j;
		for (i = 0;i < m;i++)
		{
			for (r = 0;r < n - 1;r++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][r] = Integer.parseInt(tempVar3);
				}
			}
			if (r == n - 1)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					s[i][r] = Integer.parseInt(tempVar4);
				}
			}
		}
		int z;
		int x;
		int c;
		int v;
		int p;
		i = 0;
		if (i == 0)
		{
			r = 0;
			if (r == 0)
			{
				x = s[i + 1][r];
				v = s[i][r + 1];

				if ((s[i][r] >= x) && (s[i][r] >= v))
				{
					System.out.printf("%d %d\n",i,r);
				}
			}
			for (r = 1;r < n - 1;r++)
			{
				 x = s[i + 1][r];
				 c = s[i][r - 1];
				v = s[i][r + 1];
				if ((s[i][r] >= x) && (s[i][r] >= v) && (s[i][r] >= c))
				{
					System.out.printf("%d %d\n",i,r);
				}
			}
			if (r == n - 1)
			{
				 x = s[i + 1][r];
				 c = s[i][r - 1];
					 if ((s[i][r] >= x) && (s[i][r] >= c))
					 {
					System.out.printf("%d %d\n",i,r);
					 }
			}
		}
		for (i = 1;i < m - 1;i++)
		{
			r = 0;
			if (r == 0)
			{
				z = s[i - 1][r];
				x = s[i + 1][r];
				v = s[i][r + 1];
				if ((s[i][r] >= z) && (s[i][r] >= x) && (s[i][r] >= v))
				{
					System.out.printf("%d %d\n",i,r);
				}
			}
			for (r = 1;r < n - 1;r++)
			{
				z = s[i - 1][r];
				x = s[i + 1][r];
				c = s[i][r - 1];
				v = s[i][r + 1];
				if ((s[i][r] >= z) && (s[i][r] >= x) && (s[i][r] >= v) && (s[i][r] >= c))
				{
					System.out.printf("%d %d\n",i,r);
				}
			}
		   if (r == n - 1)
		   {
			   z = s[i - 1][r];
				x = s[i + 1][r];
				c = s[i][r - 1];
				if ((s[i][r] >= z) && (s[i][r] >= x) && (s[i][r] >= c))
				{
					System.out.printf("%d %d\n",i,r);
				}
		   }
		}
		if (i == m - 1)
		{
			r = 0;
			if (r == 0)
			{
				z = s[i - 1][r];
				v = s[i][r + 1];
				if ((s[i][r] >= z) && (s[i][r] >= v))
				{
					System.out.printf("%d %d\n",i,r);
				}
			}
			for (r = 1;r < n - 1;r++)
			{
				z = s[i - 1][r];
				c = s[i][r - 1];
				v = s[i][r + 1];
				if ((s[i][r] >= z) && (s[i][r] >= v) && (s[i][r] >= c))
				{
					System.out.printf("%d %d\n",i,r);
				}
			}
		   if (r == n - 1)
		   {
			   z = s[i - 1][r];
				c = s[i][r - 1];
				if ((s[i][r] >= z) && (s[i][r] >= c))
				{
					System.out.printf("%d %d\n",i,r);
				}
		   }
		}
		return 0;
	}





}

