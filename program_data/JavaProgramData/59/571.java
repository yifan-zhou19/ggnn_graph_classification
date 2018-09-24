package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] room = new char[M][M];
		char[][] room1 = new char[M][M];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				room[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			room1[i] = room[i];
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		m--;
		while (m != 0)
		{
			for (i = 1;i <= n;i++)
			{
				k = 0;
				if ((room[i][1] == '@' || room[i - 1][0] == '@' || room[i + 1][0] == '@') && room[i][0] == '.')
				{
					room1[i][0] = '@';
				}
				for (k = 1;k < n;k++)
				{
					if ((room[i][k + 1] == '@' || room[i - 1][k] == '@' || room[i + 1][k] == '@' || room[i][k - 1] == '@') && room[i][k] == '.')
					{
						room1[i][k] = '@';
					}
				}
			}
				for (i = 1;i <= n;i++)
				{
					room[i] = room1[i];
				}
				m--;
		}
			int sum = 0;
			for (i = 1;i <= n;i++)
			{
				for (k = 0;k < n;k++)
				{
					if (room[i][k] == '@')
					{
						sum++;
					}
				}
			}
			System.out.printf("%d",sum);
			return 0;
	}

}

