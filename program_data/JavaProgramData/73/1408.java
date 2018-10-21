package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int t;
	int max;
	int min;
	int c;
	int num;
	int d;
	int[][] a = new int[5][5];
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i][j] = Integer.parseInt(tempVar);
		}
		}
	}
	d = 5;
	for (k = 0;k < 5;k++)
	{
		max = a[k][0];
		c = 0;
	  for (t = 1;t < 5;t++)
	  {
			if (a[k][t] > max)
			{
				max = a[k][t];
				c = t;
			}
	  }
		num = 0;
	  for (int m = 0;m < 5;m++)
	  {
			if (max > a[m][c])
			{
				d--;
				break;
			}
			else
			{
				num++;
			}
			if (num == 5)
			{
			System.out.printf("%d %d %d",k + 1,c + 1,a[k][c]);
			}
	  }
	}
	 if (d == 0)
	 {
		System.out.print("not found");
	 }
	 return 0;
	}
}

