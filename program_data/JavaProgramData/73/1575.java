package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int result1 = 0;
		int result2 = 0;
		int[][] a = new int[10][10];
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
		for (j = 0;j < 5;j++)
		{
			for (m = 0;m < 5;m++)
			{
				if (a[i][j] < a[i][m])
				{
					result1++;
				}
			}
			for (n = 0;n < 5;n++)
			{
				if (a[i][j] > a[n][j])
				{
					result2++;
				}
			}
				  if (result1 == 0 && result2 == 0)
				  {
					  System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
				  }
				  else
				  {
					  k++;
				  }
			result1 = 0;
			result2 = 0;
		}
	}

	if (k == 25)
	{
		System.out.print("not found");
	}
	return 0;
	}
}

