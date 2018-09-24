package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] word = new char[10000][256];
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
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 256;j++)
			{
				if (word[i][j] == 'A')
				{
					word[i][j] = 'T';
					continue;
				}
				else if (word[i][j] == 'T')
				{
					word[i][j] = 'A';
					continue;

				}
				else if (word[i][j] == 'G')
				{
					word[i][j] = 'C';
					continue;

				}
				else if (word[i][j] == 'C')
				{
					word[i][j] = 'G';
					continue;

				}
			}
		}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%s\n",word[i]);
	}


		return 0;
	}





}

