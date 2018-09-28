package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[50000][2];
		int i;
		int j;
		int ai;
		int bi;
		int s = 0;
		int k;
		int ta;
		int tb;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}


			if (i != 0)
			{
				for (k = 0;k < i;k++)
				{
					if (a[k][0] > a[i][0])
					{
						ta = a[k][0];
						tb = a[k][1];
						a[k][1] = a[i][1];
						a[k][0] = a[i][0];
						a[i][0] = ta;
						a[i][1] = tb;
					}
				}
			}
		}

		ai = a[0][0];
		bi = a[0][1];

		for (i = 0;i < n;i++)
		{
			if (a[i][0] <= ai != 0 && a[i][1] >= ai)
			{
				ai = a[i][0];
			}
			else if (a[i][1] < ai)
			{
				s = 1;
			}

			if (a[i][1] >= bi != 0 && a[i][0] <= bi)
			{
				bi = a[i][1];
			}
			else if (a[i][0] > bi)
			{
				s = 1;
			}
		}

		if (s == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d\n",ai,bi);
		}
		return 0;
	}
}

