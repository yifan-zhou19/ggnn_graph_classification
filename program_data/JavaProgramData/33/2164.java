package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] len = new int[1000];
		int j;
		char[][] sz = new char[1000][256];
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
				sz[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(sz[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (sz[i][j] == 'A')
				{
					sz[i][j] = 'T';
				}
				else if (sz[i][j] == 'T')
				{
					sz[i][j] = 'A';
				}
				else if (sz[i][j] == 'C')
				{
					sz[i][j] = 'G';
				}
				else if (sz[i][j] == 'G')
				{
					sz[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",sz[i]);
		}
		return 0;
	}


}

