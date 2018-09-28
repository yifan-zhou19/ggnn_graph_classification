package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		char[][] sz = new char[10000][260];
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
			for (j = 0;sz[i][j] != '\0';j++)
			{
					if (sz[i][j] - 'A' == 0)
					{
						sz[i][j] = 'T';
					}
					else if (sz[i][j] - 'T' == 0)
					{
						sz[i][j] = 'A';
					}
					else if (sz[i][j] - 'C' == 0)
					{
						sz[i][j] = 'G';
					}
					else if (sz[i][j] - 'G' == 0)
					{
						sz[i][j] = 'C';
					}
			}
			System.out.printf("%s\n",sz[i]);
		}
		return 0;
	}
}

