package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] base = new char[20000][300];
		int i;
		int j;
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
				base[i] = tempVar2.charAt(0);
			}
			for (j = 0;base[i][j] != 0;j++)
			{
				switch (base[i][j])
				{
					case 'A':
					{
							base[i][j] = 'T';
							break;
					}
					case 'T':
					{
							base[i][j] = 'A';
							break;
					}
					case 'G':
					{
							base[i][j] = 'C';
							break;
					}
					case 'C':
					{
							base[i][j] = 'G';
							break;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",base[i]);
		}
		return 0;
	}
}

