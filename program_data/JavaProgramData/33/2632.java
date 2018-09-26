package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		char[][] zfc = new char[LEN][LEN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[j] = tempVar2.charAt(0);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0; zfc[j][i] != 0; i++)
			{
				switch (zfc[j][i])
				{
				case 'A':
					zfc[j][i] = 'T';
					break;
				case 'T':
					zfc[j][i] = 'A';
					break;
				case 'C':
					zfc[j][i] = 'G';
					break;
				case 'G':
					zfc[j][i] = 'C';
					break;
				}
			}
			System.out.printf("%s\n", zfc[j]);
		}
		return 0;
	}
}

