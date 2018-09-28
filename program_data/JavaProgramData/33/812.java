package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] s = new char[1000][260];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			int j = 0;
			int p;
			p = String.valueOf(s[i]).length();
			for (j = 0;j < p;j++)
			{

				if (s[i][j] == 'C')
				{
				s[i][j] = 'G';
			   continue;
				}
				if (s[i][j] == 'G')
				{
					s[i][j] = 'C';
				continue;
				}
				if (s[i][j] == 'A')
				{
				s[i][j] = 'T';
				continue;
				}
				if (s[i][j] == 'T')
				{
					s[i][j] = 'A';
				}

			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
		return 0;
	}
}

