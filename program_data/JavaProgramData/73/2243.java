package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] min = new int[5];
		int i;
		int b;
		int c;
		int j;
		int k = 0;
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
		}
		for (j = 0;j < 5;j++)
		{
			min[j] = a[0][j];
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}


			}
		}
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
			}
		}






		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (min[j] == max[i])
				{
					b = i + 1;
					c = j + 1;
					System.out.printf("%d %d ",b,c);
					System.out.printf("%d",max[i]);
					k++;

				}




			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}


		return 0;
	}

}

