package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int len;
		char[][] jianji = new char[1000][300];
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
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(jianji[i]).length();
			for (j = 0;j < len;j++)
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
				else if (jianji[i][j] == 'G')
				{
					jianji[i][j] = 'C';
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",jianji[i]);
		}
	}

}

