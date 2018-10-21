package <missing>;

public class GlobalMembers
{
	public static int in_or_not(int n, int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] data = new int[5][5];
		int[] temp = new int[5];
		int n;
		int m;
		int i;
		int j;
		int result;
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					data[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		result = in_or_not(n, m);
		if (result == 0)
		{
			System.out.print("error");
		}
		if (result == 1)
		{
			for (i = 0;i < 5;i++)
			{
				temp[i] = data[i][n];
				data[i][n] = data[i][m];
				data[i][m] = temp[i];
			}
			for (j = 0;j < 5;j++)
			{
				System.out.printf("%d %d %d %d %d\n",data[0][j],data[1][j],data[2][j],data[3][j],data[4][j]);
			}
		}
		return 0;
	}
}

