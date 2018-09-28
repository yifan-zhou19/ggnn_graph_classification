package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int s;
		int t;
		int max = 0;
		int hang;
		int lie;
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
	max = 0;
			t = 0;
			for (s = 0;s < 5;s++)
			{
				if (a[i][s] >= max)
				{
					max = a[i][s];
					hang = i;
					lie = s;
				}
			}
			for (j = 0;j < 5;j++)
			{
				if (max > a[j][lie])
				{
					t++;
				}
			}
			if (t == 0)
			{
				System.out.printf("%d %d %d",hang + 1,lie+1,max);
				m++;
			}
		}
		if (m == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

