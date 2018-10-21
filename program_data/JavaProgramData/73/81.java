package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int max;
		int min;
		int lie = 0;
		int m = 0;
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
			lie = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					lie = j;
				}
			}
			min = a[0][lie];
			for (j = 0;j < 5;j++)
			{
				if (a[j][lie] < min)
				{
				min = a[j][lie];
				}
			}
			if (min == a[i][lie])
			{
				System.out.printf("%d %d %d\n",i + 1,lie+1,a[i][lie]);
				m = 1;
			}
		}
		if (m == 0)
		{
		System.out.print("not found\n");
		}

		return 0;
	}

}

