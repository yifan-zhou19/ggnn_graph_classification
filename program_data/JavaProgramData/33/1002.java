package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[1000][256];
		int n;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc[n - 1] = tempVar3.charAt(0);
		}
		for (int i = 0;i < n;i++)
		{
			y = String.valueOf(zfc[i]).length();
			for (int j = 0;j < y;j++)
			{
				if (zfc[i][j] == 'A')
				{
					zfc[i][j] = 'T';
				}
				else if (zfc[i][j] == 'T')
				{
					zfc[i][j] = 'A';
				}
				else if (zfc[i][j] == 'C')
				{
					zfc[i][j] = 'G';
				}
				else
				{
					zfc[i][j] = 'C';
				}
			}
			System.out.printf("%s\n",zfc[i]);
		}
		return 0;
	}

}

