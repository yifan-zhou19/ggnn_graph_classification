package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int max;
		int x;
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
			for (x = 0,max = a[i][0],j = 1;j < 5;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					x = j;
				}
			}
			for (j = 0;j < 5;j++)
			{
				if (max > a[j][x])
				{
					break;
				}
			}
			if (j == 5)
			{
				System.out.printf("%d %d %d",i + 1,x + 1,max);
				break;
			}
		}
		if (i == 5 && j != 5)
		{
			System.out.print("not found");
		}
		return 0;
	}








}

