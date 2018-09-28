package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int t1;
		int t2;
		int sum;
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
		sum = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				t1 = 0;
				t2 = 0;
				for (k = 0;k < 5;k++)
				{
					if (a[i][k] > a[i][j])
					{
					t1++;
					}
					if (a[k][j] < a[i][j])
					{
					t2++;
					}
				}
				if (t1 == 0 && t2 == 0)
				{
					System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					sum++;
				}
			}
		}
		if (sum == 0)
		{
		System.out.print("not found");
		}
	}

}

