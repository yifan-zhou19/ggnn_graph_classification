package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		char[][] zfc = new char[50][33];
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
				zfc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;zfc[i][j] != '\0';j++)
			{
				m = String.valueOf(zfc[i]).length();
				if (strcmp(zfc[i][m - 2], "er") == 0)
				{
					zfc[i][m - 2] = '\0';
				}
				else if (strcmp(zfc[i][m - 2], "ly") == 0)
				{
					zfc[i][m - 2] = '\0';
				}
				else if (strcmp(zfc[i][m - 3], "ing") == 0)
				{
					zfc[i][m - 3] = '\0';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",zfc[i]);
		}
		return 0;
	}

}

