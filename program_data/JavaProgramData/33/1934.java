package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] str = new char[1000][256];
		final String s = "";
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
			len = String.valueOf(str[i]).length();
			for (j = 0;j < len;j++)
			{
				if (str[i][j] == 'A')
				{
					s.charAt(i)[j] = 'T';
				}
				if (str[i][j] == 'T')
				{
					s.charAt(i)[j] = 'A';
				}
				if (str[i][j] == 'G')
				{
					s.charAt(i)[j] = 'C';
				}
				if (str[i][j] == 'C')
				{
					s.charAt(i)[j] = 'G';
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s.charAt(i));
		}
		return 0;
	}
}

