package <missing>;

public class GlobalMembers
{
	public static int[][] k = new int[10000][10000];
	public static int Main()
	{
		int n;
		int x;
		int y;
		int flag;
		int i;
		int j;
		int pre;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				k[i][j] = 0;
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (y) != 0 && (x != 0 || y != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			k[x][y] = 1;
		}
		pre = 0;
		for (i = 1;i < n;i++)
		{
			if (k[pre][i] == 1)
			{
				pre = i;
			}
		}
		flag = 1;
		for (i = 0;i < n;i++)
		{
			if (i != pre)
			{
				if (k[pre][i] == 1)
				{
					flag = 0;
					break;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		else
		{
			System.out.print(pre);
			System.out.print("\n");
		}
		return 0;
	}

}

