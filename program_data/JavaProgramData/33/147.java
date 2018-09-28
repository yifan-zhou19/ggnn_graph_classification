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
		char[][] zf = new char[1000][300];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf[i] = tempVar2.charAt(0);
			}
			for (j = 0;j < 300;j++)
			{
				if ((zf[i][j]) == 'A')
				{
					zf[i][j] = 'T';
				}
				else if ((zf[i][j]) == 'T')
				{
					zf[i][j] = 'A';
				}
				else if ((zf[i][j]) == 'G')
				{
					zf[i][j] = 'C';
				}
				else if ((zf[i][j]) == 'C')
				{
					zf[i][j] = 'G';
				}
				else if ((zf[i][j]) == '\0')
				{
					break;
				}
			}
				System.out.printf("%s\n",zf[i]);
		}
		return 0;
	}

}

