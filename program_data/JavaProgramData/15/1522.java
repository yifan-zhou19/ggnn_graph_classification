package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[][] point = new int[M][N];
			int i;
			int j;
			int n;
			int a;
			int b;
			int c;
			int d;
			int sum = 0;
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
							if (point[i][j] == 0 && point[i + 1][j] == 0 && point[i + 1][j + 1] == 255 && point[i][j + 1] == 0)
							{
									a = i;
									b = j;
							}
							if (point[i][j] == 0 && point[i + 1][j] == 255 && point[i + 1][j + 1] == 255 && point[i][j + 1] == 255)
							{
									c = i;
									d = j;
							}
							sum = (c - a - 1) * (d - b - 1);
					}
			}
			System.out.printf("%d\n",sum);
			return 0;
	}

}

