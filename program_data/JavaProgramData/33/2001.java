package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] zfc1 = new char[1000][1000];
		char[][] zfc2 = new char[1000][1000];
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
				zfc1[i] = tempVar2.charAt(0);
			}
			for (j = 0;zfc1[i][j] != '\0';j++)
			{
				if (zfc1[i][j] == 'A')
				{
					zfc2[i][j] = 'T';
				}
				else if (zfc1[i][j] == 'G')
				{
				zfc2[i][j] = 'C';
				}
				else if (zfc1[i][j] == 'C')
				{
				zfc2[i][j] = 'G';
				}
				else if (zfc1[i][j] == 'T')
				{
					zfc2[i][j] = 'A';
				}
			}
			zfc2[i][j] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",zfc2[i]);
		}
		return 0;
	}
}

