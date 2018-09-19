package <missing>;

public class GlobalMembers
{
	public static int gl(int[][] a, int k)
	{
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			int min = 999;
			for (j = 0;j < k;j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0;j < k;j++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (i = 0;i < k;i++)
		{
			int min = 999;
			for (j = 0;j < k;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (j = 0;j < k;j++)
			{
				a[j][i] = a[j][i] - min;
			}
		}
		return (a[1][1]);
	}
	public static void xj(int[][] a, int k)
	{
	   int i;
	   int j;
	   for (i = 0;i < k;i++)
	   {
		   for (j = 2;j < k;j++)
		   {
			   a[i][j - 1] = a[i][j];
		   }
	   }
	   for (i = 0;i < k;i++)
	   {
		   for (j = 2;j < k;j++)
		   {
			   a[j - 1][i] = a[j][i];
		   }
	   }
	}
	public static int Main()
	{
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int j;
			int l;
			int sum = 0;
			int[][] a = new int[102][102];
			for (j = 0;j < k;j++)
			{
				for (l = 0;l < k;l++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][l] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (j = 0;j < k - 1;j++)
			{
			   int temp;
			   temp = gl(a, k - j);
			   //printf("%d\n",temp);
			   sum = sum + temp;
			   xj(a, k - j);
			}
			System.out.printf("%d\n",sum);
		}
	}
}

