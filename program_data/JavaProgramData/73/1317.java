package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int st;
		int err;
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] p = new int[5];
		err = 1;
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
			max[i] = a[i][0];
			p[i] = 0;
			for (j = 1;j < 5;j++)
			{
				if (max[i] < a[i][j])
				{
					max[i] = a[i][j];
					p[i] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			st = 0;
			for (j = 0;j < 5;j++)
			{
				if (j != i)
				{
					if (max[i] > a[j][p[i]])
					{
						st = 1;
					}
				}
			}
				if (st == 0)
				{
					System.out.printf("%d %d %d",i + 1,p[i] + 1,max[i]);
					err = 0;
				}
		}
		if (err == 1)
		{
			System.out.print("not found");
		}




		return 0;
	}





}

