package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int z;
		int[][] point = new int[100][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					point[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (point[i][j] == 0)
				{
					if (i == 0 && j == 0 || i == 0 && j != 0 && point[i][j - 1] != 0 || i != 0 && point[i - 1][j] != 0 && j != n - 1 && point[i][j + 1] == 0 && j != 0 && point[i][j - 1] != 0 || i != 0 && point[i - 1][j] != 0 && j != n - 1 && point[i][j + 1] == 0 && j == 0)
					{
						a = i;
						b = j;
					}
					else if (j == n - 1 || j != n - 1 && point[i][j - 1] == 0 && point[i][j + 1] != 0)
					{
						c = i;
						d = j;
					}
				}
			}
		}
		z = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",z);

		return 0;
	}



}

