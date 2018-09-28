package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] result = new int[5];
		int i;
		int j;
		int max;
		int min;
		int c;
		int d;
		int e;
		int p;
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
		for (i = 0;i < 5;i++)
		{
			max = a[i][0];
			c = i;
			d = 0;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					c = i;
					d = j;
				}
			}
			min = a[0][d];
			e = 0;
			for (p = 1;p < 5;p++)
			{
				if (a[p][d] < min)
				{
					min = a[p][d];
					e = p;
				}
			}
			if (e == c)
			{
				System.out.printf("%d %d %d\n",c + 1,d + 1,a[c][d]);
			}
			else
			{
				result[i] = 0;
			}
		}
		if ((result[0] == 0) && (result[1] == 0) && (result[2] == 0) && (result[3] == 0) && (result[4] == 0))
		{
			System.out.print("not found");
		}
		return 0;
	}

}

