package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[10][10];
	int i;
	int j;
	int m;
	int n;
	int[] x = new int[10];
	int[] c = new int[10];
	int[] d = new int[10];

	for (i = 0;i < 5;i++)
	{
		x[i] = 0;
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			if (a[i][j] > x[i])
			{
			x[i] = a[i][j];
			}
		}
	}
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			if (a[i][j] == x[i])
			{ //c[i]=i;
			d[i] = j;
			//printf("%d\n",a[i][j]);
			//printf("%d",d[i]);
			}
		}
	}
	n = 0;
	for (i = 0;i < 5;i++)
	{
	   m = d[i];
	   if (a[i][m] <= a[0][m] != 0 && a[i][m] <= a[1][m] != 0 && a[i][m] <= a[2][m] != 0 && a[i][m] <= a[3][m] != 0 && a[i][m] <= a[4][m])
	   {
	   c[i] = 1;
	   }
	   else
	   {
		   c[i] = 0;
	   }
	   n = n + c[i];
	}

	if (n == 0)
	{
		System.out.print("not found");
	}
	else
	{
	for (i = 0;i < 5;i++)
	{
		m = d[i];
		if (c[i] == 1)
		{
			System.out.printf("%d %d %d\n",i + 1,m + 1,a[i][m]);
		}
	}
	}

	return 0;
	}


}

