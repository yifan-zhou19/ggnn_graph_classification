package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] jj = new char[1000][300];
		int i;
		int n;
		int[] len = new int[1000];
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
				jj[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(jj[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (jj[i][j] == 'A')
				{
					jj[i][j] = 'T';
				}
				else if (jj[i][j] == 'T')
				{
					jj[i][j] = 'A';
				}
				else if (jj[i][j] == 'C')
				{
					jj[i][j] = 'G';
				}
				else if (jj[i][j] == 'G')
				{
					jj[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",jj[i]);
		}


		return 0;


	}
}

