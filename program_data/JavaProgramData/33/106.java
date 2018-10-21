package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] jianji = new char[1000][256];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jianji[i] = tempVar2.charAt(0);
			}
			for (j = 0;j < (int)String.valueOf(jianji[i]).length();j++)
			{
				if (jianji[i][j] == 'A')
				{
					jianji[i][j] = 'T';
				}
				else if (jianji[i][j] == 'T')
				{
					jianji[i][j] = 'A';
				}
				else if (jianji[i][j] == 'C')
				{
					jianji[i][j] = 'G';
				}
				else
				{
					jianji[i][j] = 'C';
				}
			}

		}
				for (i = 0;i < n;i++)
				{
					System.out.printf("%s\n",jianji[i]);
				}

		return 0;
	}
}

