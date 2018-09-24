package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] jianji = new char[1000][256];
		int n;
		int i;
		int k;
		int m;
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
			m = String.valueOf(jianji[i]).length();
			for (k = 0;k < m;k++)
			{
				if (jianji[i][k] == 'A')
				{
					jianji[i][k] = 'T';
				}
				else
				{
					if (jianji[i][k] == 'T')
					{
					jianji[i][k] = 'A';
					}
					else
					{
						if (jianji[i][k] == 'C')
						{
					jianji[i][k] = 'G';
						}
						else
						{
							if (jianji[i][k] == 'G')
							{
					jianji[i][k] = 'C';
							}
						}
					}
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

