package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] x = new int[hang][lie];
		int s = 0;
		int x1;
		int y1;
		int x2;
		int y2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		n = n;

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								x[i][j] = Integer.parseInt(tempVar2);
							}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
							if (x[i][j] == 0 && x[i - 1][j] == 255 && x[i][j - 1] == 255 && x[i + 1][j] == 0 && x[i][j + 1] == 0)
							{
							x1 = i;
							y1 = j;
							}
							else if (x[i][j] == 0 && x[i - 1][j] == 0 && x[i][j - 1] == 0 && x[i + 1][j] == 255 && x[i][j + 1] == 255)
							{
							x2 = i;
							y2 = j;
							}
			}
		}
		s = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

