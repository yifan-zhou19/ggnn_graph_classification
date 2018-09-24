package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[2000][400];
		int i;
		int j;
		int n;
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
				if (zfc[i][j] == 'A')
				{
					zfc[i][j] = 'T';
					continue;
				}
				if (zfc[i][j] == 'T')
				{
					zfc[i][j] = 'A';
					continue;
				}
				if (zfc[i][j] == 'G')
				{
					zfc[i][j] = 'C';
					continue;
				}
				if (zfc[i][j] == 'C')
				{
					zfc[i][j] = 'G';
					continue;
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

