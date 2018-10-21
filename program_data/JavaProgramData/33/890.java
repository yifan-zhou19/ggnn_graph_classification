package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[1000][256];
		int i;
		int p = 0;
		int n;
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
				str[i] = tempVar2.charAt(0);
			}
			for (j = 0;str[i][j] != '\0';j++)
			{
				switch (str[i][j])
				{
				case 'A':
				str[i][j] = 'T';
				break;
				case 'T':
				str[i][j] = 'A';
				break;
				case 'G':
				str[i][j] = 'C';
				break;
				case 'C':
				str[i][j] = 'G';
				break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str[i]);
		}
		return 0;
	}

}

