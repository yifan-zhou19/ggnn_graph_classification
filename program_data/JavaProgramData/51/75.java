package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[500]);
		char[][] ng = new char[500][500];
		int[] sz = new int[500];
		int[] imax = new int[500];
		int[] ximax = new int[500];
		int n;
		int m;
		int i;
		int t;
		int k;
		int max;
		int a;
		int d;
		int e;
		t = 0;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		m = zfc.length();
		for (i = 0;i <= m - n;i++)
		{
			for (k = i;k < i + n;k++)
			{
				ng[i][k - i] = zfc.charAt(k);
			}
		}
		for (i = 0;i < m;i++)
		{
			sz[i] = 0;
		}
		for (i = 1;i <= m - n;i++)
		{
		  for (a = 1;a <= i;a++)
		  {
			for (k = 0;k < n;k++)
			{
				if (ng[i][k] == ng[i - a][k])
				{
					d++;
				}
			}
		   if (d == n)
		   {
			   sz[i]++;
		   }
		   d = 0;
		  }
		}
		for (i = 0;i <= m - n;i++)
		{
			if (i == 0)
			{
				max = sz[i];
			}
			else if (sz[i] > max)
			{
				max = sz[i];
			}
		}
		for (i = 0;i <= m - n;i++)
		{
			if (sz[i] == max)
			{
				imax[t] = i;
				t = t + 1;
			}
		}
		for (a = 0;a < t;a++)
		{
			ximax[a] = 0;
		}
		d = 0;
		for (i = 0;i <= m - n;i++)
		{
		  for (a = 0;a < t;a++)
		  {
			for (k = 0;k < n;k++)
			{
				if (ng[i][k] == ng[imax[a]][k])
				{
					d++;
				}
			}
		   if ((d == n) && (ximax[a] == 0))
		   {
			   ximax[a] = i - 1000;
			   d = 0;
			   break;
		   }
		   else
		   {
			   d = 0;
		   }
		  }
		}
		 for (a = 0;a < t;a++)
		 {
			 ximax[a] = ximax[a] + 1000;
		 }
		   for (a = 0;a < t;a++)
		   {
			   imax[a] = ximax[a];
		   }
		for (k = 1;k <= t;k++)
		{
		for (i = 0;i < t - k;i++)
		{
				if (imax[i] > imax[i + 1])
				{
						e = imax[i + 1];
						imax[i + 1] = imax[i];
						imax[i] = e;
				}
		}
		}
		if (max <= 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max + 1);
		for (i = 0;i < t;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (k == n - 1)
				{
					System.out.printf("%c\n",ng[imax[i]][k]);
				}
				else
				{
					System.out.printf("%c",ng[imax[i]][k]);
				}
			}
		}
		}
		return 0;
	}


}

