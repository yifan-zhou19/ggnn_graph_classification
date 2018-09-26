package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[n][257];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 257;j++)
			{
				if (zfc[i][j] == 'A')
				{
					zfc[i][j] = 'T';
				}
				else
				{
					if (zfc[i][j] == 'T')
					{
						zfc[i][j] = 'A';
					}
					else
					{
						if (zfc[i][j] == 'C')
						{
							zfc[i][j] = 'G';
						}
						else
						{
							if (zfc[i][j] == 'G')
							{
								zfc[i][j] = 'C';
							}
							else
							{
								break;
							}
						}
					}
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			System.out.printf("%s\n",zfc[i]);
		}
		return 0;
	}

}

