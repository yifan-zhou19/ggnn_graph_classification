package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] pd = new char[n][256];
		char A;
		char T;
		char C;
		char G;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(pd[i]) = tempVar2.charAt(0);
			}
			for (int m = 0;pd[i][m] != '\0';m++)
			{
				if (pd[i][m] == 'A')
				{
				 pd[i][m] = 'T';
				}
				else if (pd[i][m] == 'T')
				{
				 pd[i][m] = 'A';
				}
				else if (pd[i][m] == 'C')
				{
					pd[i][m] = 'G';
				}
				else if (pd[i][m] == 'G')
				{
					pd[i][m] = 'C';
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
		System.out.printf("%s\n",pd[i]);
		}
		return 0;
	}


}

