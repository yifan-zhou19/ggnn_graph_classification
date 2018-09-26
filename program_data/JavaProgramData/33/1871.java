package <missing>;

public class GlobalMembers
{
	public static int[] len = new int[10000];
	public static char[][] str = new char[10000][10000];
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
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		len[i] = String.valueOf(str[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (str[i][j] == 'A')
				{
					str[i][j] = 'T';
				continue;
				}
				if (str[i][j] == 'T')
				{
					str[i][j] = 'A';
				continue;
				}
				if (str[i][j] == 'C')
				{
					str[i][j] = 'G';
				continue;
				}
				if (str[i][j] == 'G')
				{
					str[i][j] = 'C';
				continue;
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

