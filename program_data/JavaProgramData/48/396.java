package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int date;
		int day;
		int i;
		int j;
		int[][] a = new int[11][11];
		int[][] t = new int[11][11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[5][5] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			date = Integer.parseInt(tempVar2);
		}
		for (day = 1;day <= date;day++)
		{
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					t[i][j] = a[i][j] * 2 + a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					a[i][j] = t[i][j];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			if (i != 1)
			{
				System.out.print("\n");
			}
			for (j = 1;j < 10;j++)
			{
				if (j != 1)
				{
					System.out.print(" ");
				}
				System.out.printf("%d",a[i][j]);
			}
		}
		return 0;
	}
}

