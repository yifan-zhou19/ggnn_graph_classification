package <missing>;

public class GlobalMembers
{
	public static char[][] input = new char[1000][256];
	public static char[][] output = new char[1000][256];
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

		char[][] input = new char[1000][256];
		char[][] output = new char[1000][256];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input[i] = tempVar2.charAt(0);
			}
		}

		for (i = 0;i < n;i++)
		{
			len = String.valueOf(input[i]).length();
			for (j = 0;j < len;j++)
			{
				if (input[i][j] == 'A')
				{
					output[i][j] = 'T';
				}
				if (input[i][j] == 'T')
				{
					output[i][j] = 'A';
				}
				if (input[i][j] == 'C')
				{
					output[i][j] = 'G';
				}
				if (input[i][j] == 'G')
				{
					output[i][j] = 'C';
				}
			}
			output[i][len] = '\0';
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",output[i]);
		}


		return 0;
	}
}

