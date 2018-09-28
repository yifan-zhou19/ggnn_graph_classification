package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		char[][] cz = new char[10000][32];
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
				cz[i] = tempVar2.charAt(0);
			}
			m = String.valueOf(cz[i]).length();
				if (cz[i][m - 1] == 'r' && cz[i][m - 2] == 'e')
				{
					cz[i][m - 2] = 0;
				}

				if (cz[i][m - 1] == 'y' && cz[i][m - 2] == 'l')
				{
					cz[i][m - 2] = 0;
				}
				while (m >= 4)
				{
				if (cz[i][m - 1] == 'g' && cz[i][m - 2] == 'n' && cz[i][m - 3] == 'i')
				{
					cz[i][m - 3] = 0;
				}
					break;
				}
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%s\n",cz[j]);
		}
		return 0;
	}
}

