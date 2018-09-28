public class dis
{
	public int[] p1 = new int[3];
	public int[] p2 = new int[3];
	public double d;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[10][3];
		int i;
		int j;
		int k;
		int r;
		int n;
		dis[] dt = tangible.Arrays.initializeWithDefaultdisInstances(45);
		dis t = new dis();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0,r = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				for (dt[r].d = 0,k = 0;k < 3;k++)
				{
					dt[r].p1[k] = a[i][k];
					dt[r].p2[k] = a[j][k];
					dt[r].d += (a[i][k] - a[j][k]) * (a[i][k] - a[j][k]);
				}
				dt[r].d = Math.sqrt(dt[r].d);
				r++;
			}
		}
		for (r = 1;r < n * (n - 1) / 2;r++)
		{
			for (k = 0;k < n * (n - 1) / 2 - r;k++)
			{
				if (dt[k].d <= dt[k + 1].d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=dt[k];
					t.copyFrom(dt[k]);
					dt[k] = dt[k + 1];
					dt[k + 1] = t;
				}
			}
		}
		for (i = r - 1;dt[i].d == dt[i - 1].d;i--)
		{
			;
		}
		for (j = r - 1;j > i;j--)
		{
			for (k = r - 1;k >= i + r - j;k--)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=dt[k];
				t.copyFrom(dt[k]);
				dt[k] = dt[k - 1];
				dt[k - 1] = t;
			}
		}

		for (i = 0;i < r;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",dt[i].p1[0],dt[i].p1[1],dt[i].p1[2],dt[i].p2[0],dt[i].p2[1],dt[i].p2[2],dt[i].d);
		}
	}
}

