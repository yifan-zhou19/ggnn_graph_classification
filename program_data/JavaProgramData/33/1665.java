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
		char[][] zfc = new char[n][256];
		char[][] zf = new char[n][256];

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
			for (j = 0;j < 255;j++)
			{
				if (zfc[i][j] == 'A')
				{
					zf[i][j] = 'T';
				}
				else if (zfc[i][j] == 'T')
				{
					zf[i][j] = 'A';
				}
				else if (zfc[i][j] == 'C')
				{
					zf[i][j] = 'G';
				}
				else if (zfc[i][j] == 'G')
				{
					zf[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%s\n",zf[i]);
		}
		System.out.printf("%s",zf[n - 1]);
		return 0;
	}


}

