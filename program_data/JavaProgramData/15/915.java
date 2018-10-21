package <missing>;

public class GlobalMembers
{
	public static int[][] p = new int[1001][1001];

	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int leftx;
		int lefty;
		int rightx;
		int righty;
		int flag = 1;
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
					p[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i + 1 < n && j + 1 < n && p[i][j] == 0 && p[i + 1][j] == 0 && p[i][j + 1] == 0)
				{
					leftx = i;
					lefty = j;
				}
				if (i - 1 >= 0 && j - 1 >= 0 && p[i][j] == 0 && p[i - 1][j] == 0 && p[i][j - 1] == 0)
				{
					rightx = i;
					righty = j;
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				break;
			}
		}
		System.out.printf("%d\n",(rightx - leftx - 1) * (righty - lefty - 1));
		System.in.read();
		System.in.read();
		return 0;
	}

}

