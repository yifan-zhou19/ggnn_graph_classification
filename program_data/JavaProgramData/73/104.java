package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int min;
		int i;
		int j;
		int k;
		int l;
		int result = 0;
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
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
			min = a[i][0];
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] <= min)
				{
					min = a[i][j];
					k = j;
				}
			}
			for (l = 0;l < 5;l++)
			{

				if (a[l][k] > a[i][k])
				{
					break;
				}
				if (l == 4)
				{
					result = 1;
					System.out.printf("%d %d %d",k + 1,i + 1,a[i][k]);
				}

			}
		}
		if (result == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}
}

