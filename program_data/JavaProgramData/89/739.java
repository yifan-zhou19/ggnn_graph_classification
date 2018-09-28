package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int sum;
		int r;
		int j;
		int f;
		int[][] a = new int[100000][2];
		int[] b = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		r = 0;
		f = 0;
		for (i = 0;i < 10000;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < 10000;i++)
		{
			for (j = 0;j < 2;j++)
			{
				a[i][j] = -1;
			}
		}
		for (i = 0;;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (j == 1)
				{
					sum++;
					if (a[i][0] == 0 && a[i][1] == 0)
					{
						break;
					}
				}
			}
			if (a[i][0] == 0 && a[i][1] == 0)
			{
					break;
			}
		}
		for (i = 0;i < sum - 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][1] == j)
				{
					b[j]++;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == n - 1)
			{
				for (j = 0;j < sum - 1;j++)
				{
					if (a[j][0] == i)
					{
						r++;
					}
				}
				 if (r == 0)
				 {
					b[i] = -1;
					f++;
				 }
				r = 0;
			}
		}
		if (f == 0)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				 if (b[i] == -1)
				 {
					System.out.printf("%d\n",i);
				 }
			}
		}
		return 0;
	}


}

