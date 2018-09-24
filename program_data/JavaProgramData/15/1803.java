package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] an = new int[100][100];
		int i;
		int j;
		int n;
		int s;
		int a;
		int b;
		int flag = 0;
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
				an[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (an[i][j] == 0)
				{
				   flag = 1;
			break;
				}
			}
		if (flag == 1)
		{
					break;
		}

		}
	flag = 0;
		for (a = n - 1;a >= 0;a--)
		{
			for (b = n - 1;b >= 0;b--)
			{
				if (an[a][b] == 0)
				{
			flag = 1;
					break;
				}
			}
	if (flag == 1)
	{
					break;
	}
		}

		s = (b - j - 1) * (a - i - 1);
		System.out.printf("%d",s);
		return 0;
	}


}

