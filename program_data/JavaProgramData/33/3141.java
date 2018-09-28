package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] jjd = new char[n][LEN];
		char[][] pdl = new char[n][LEN];
		for (i = 0;i < n;i++)
		{
			 for (j = 0;j < LEN;j++)
			 {
				 pdl[i][j] = '\0';
			 }
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jjd[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(jjd[i]).length();
			for (j = 0;j < len;j++)
			{
				if (jjd[i][j] == 'A')
				{
					pdl[i][j] = 'T';
				}
				else
				{
					if (jjd[i][j] == 'T')
					{
					pdl[i][j] = 'A';
					}
				else
				{
					if (jjd[i][j] == 'G')
					{
						pdl[i][j] = 'C';
					}
				else
				{
					if (jjd[i][j] == 'C')
					{
						pdl[i][j] = 'G';
					}
				}
				}
				}
			}
			System.out.printf("%s\n",pdl[i]);
		}





		return 0;
	}

}

