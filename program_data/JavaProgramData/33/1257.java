package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[9999][256];
		int n;
		int i;
		int j;
		int[] sz = new int[9999];
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
			sz[i] = String.valueOf(zfc[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < sz[i];j++)
			{
				if (zfc[i][j] == 'A')
				{
					zfc[i][j] = 'T';
				}
				else if (zfc[i][j] == 'T')
				{
					zfc[i][j] = 'A';
				}
				else if (zfc[i][j] == 'G')
				{
					zfc[i][j] = 'C';
				}
				else if (zfc[i][j] == 'C')
				{
					zfc[i][j] = 'G';
				}
			}
			zfc[i][sz[i]] = '\0';
			System.out.printf("%s\n",zfc[i]);

		}

		return 0;
	}




}

