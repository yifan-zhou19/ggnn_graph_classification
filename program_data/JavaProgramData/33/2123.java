package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		char[][] zfc = new char[1000][256];
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
			for (k = 0; zfc[i][k] != 0; k++)
			{
				switch (zfc[i][k])
				{
				case 'A':
					zfc[i][k] = 'T';
					break;
				case 'G':
					zfc[i][k] = 'C';
					break;
				case 'T':
					zfc[i][k] = 'A';
					break;
				case 'C':
					zfc[i][k] = 'G';
					break;
				}

			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",zfc[i]);
		}
		return 0;
	}

}

