package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int cnt = 0;
		int[][] room = new int[100][100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n;i++)
		{
			scanf("\n");
			for (j = 0;j < n;j++)
			{
				char c;
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					c = tempVar2.charAt(0);
				}
				switch (c)
				{
				case '.': //??
					room[i][j] = 0;
					break;
				case '#': //??
					room[i][j] = -1;
					break;
				case '@': //??
					room[i][j] = 1;
					break;
				}
			}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		for (k = 2; k <= m; k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (room[i][j] > 0 && room[i][j] < k)
					{ //???????????
						if (i > 0 && room[i - 1][j] == 0)
						{
							room[i - 1][j] = k;
						}
						if (j > 0 && room[i][j - 1] == 0)
						{
							room[i][j - 1] = k;
						}
						if (j < n && room[i][j + 1] == 0)
						{
							room[i][j + 1] = k;
						}
						if (i < n && room[i + 1][j] == 0)
						{
							room[i + 1][j] = k;
						}
					}
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] > 0)
				{
					cnt++;
				}
			}
		}

		System.out.printf("%d", cnt);

		return 0;
	}
}

