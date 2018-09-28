package <missing>;

public class GlobalMembers
{
	public static char com(char ch)
	{
		if (ch == 'A')
		{
			return 'T';
		}
		else if (ch == 'T')
		{
			return 'A';
		}
		else if (ch == 'G')
		{
			return 'C';
		}
		else if (ch == 'C')
		{
			return 'G';
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] chain = new char[1000][256];
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
				chain[i] = tempVar2.charAt(0);
			}
			for (j = 0;j < String.valueOf(chain[i]).length();j++)
			{
				chain[i][j] = com(chain[i][j]);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",chain[i]);
		}
		return 0;
	}


}

