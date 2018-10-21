package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] s = new int[1000][1000];
		int x1;
		int y1;
		int x2;
		int y2;
		int num;
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
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
				if (s[i][j] == 0 && s[i + 1][j] == 0 && s[i + 2][j] == 0 && s[i][j + 1] == 0 && s[i + 1][j + 1] == 255)
				{
					x1 = i;
					y1 = j;
				}
				}
			}

			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
				if (s[i][j] == 0 && s[i - 1][j] == 0 && s[i - 2][j] == 0 && s[i][j - 1] == 0 && s[i - 1][j - 1] == 255)
				{
					x2 = i;
					y2 = j;
				}
				}
			}
		   num = (x2 - x1 - 1) * (y2 - y1 - 1);
			 System.out.printf("%d",num);
	return 0;
	}
}

