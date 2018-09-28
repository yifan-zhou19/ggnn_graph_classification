package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] jj = new char[1000][300];
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
			jj[i] = tempVar2.charAt(0);
		}
			for (j = 0;j < String.valueOf(jj[i]).length();j++)
			{
				if (jj[i][j] == 'A')
				{
					jj[i][j] = 'T';
				continue;
				}
				if (jj[i][j] == 'T')
				{
					jj[i][j] = 'A';
				continue;
				}
				if (jj[i][j] == 'G')
				{
					jj[i][j] = 'C';
				continue;
				}
				if (jj[i][j] == 'C')
				{
					jj[i][j] = 'G';
				continue;
				}
			}
			System.out.printf("%s\n",jj[i]);
	}
			return 0;

	return 0;
	}



}

