package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[1000][300];
		int[] k = new int[1000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			k[i] = String.valueOf(zfc[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < k[i];j++)
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
			System.out.printf("%s\n",zfc[i]);
		}
		return 0;
	}
}

