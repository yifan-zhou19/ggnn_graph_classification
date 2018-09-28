package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int all;
		int i;
		int p;
		int day;
		int o;
		int count;
		char[][] name = new char[101][101];
		char[][] prename = new char[101][101];
		count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= all;i++)
		{
			scanf("\n");
			for (p = 1;p <= all;p++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					name[i][p] = tempVar2.charAt(0);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		for (o = 1;o < day;o++)
		{
			for (i = 1;i <= all;i++)
			{
				for (p = 1;p <= all;p++)
				{
					prename[i][p] = name[i][p];
				}
			}
		for (i = 1;i <= all;i++)
		{
			for (p = 1;p <= all;p++)
			{
				if (name[i][p] == '.')
				{
					if (prename[i][p + 1] == '@' || prename[i][p - 1] == '@' || prename[i + 1][p] == '@' || prename[i - 1][p] == '@')
					{
						name[i][p] = '@';
					}
				}
			}
		}
		}
		for (i = 1;i <= all;i++)
		{
			for (p = 1;p <= all;p++)
			{
				if (name[i][p] == '@')
				{
					count++;
				}
			}
		}
		System.out.printf("%d",count);
	return 0;
	}
}

