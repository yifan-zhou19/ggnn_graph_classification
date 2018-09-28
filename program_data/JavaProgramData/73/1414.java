package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[][] a = new int[N][N];
		int i;
		int j;
		int k;
		int q;
		int count1;
		int count2;
		int num = 0;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				count1 = 0;
				for (q = 0;q < N;q++)
				{
					if (a[i][j] >= a[i][q])
					{
						count1++;
					}
				}
				if (count1 == N)
				{
					count2 = 0;
					for (k = 0;k < N;k++)
					{
						if (a[i][j] <= a[k][j])
						{
							count2++;
						}
					}
					if (count2 == N)
					{
						System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
						num++;
					}
				}
			}
		}
		if (num == 0)
		{
			System.out.print("not found\n");
		}
		return 0;
	}
}

