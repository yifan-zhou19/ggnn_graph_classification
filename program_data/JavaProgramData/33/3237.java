package <missing>;

public class GlobalMembers
{
	public static char[][] s = new char[1024][1024];
	public static int Main()
	{

		int n;
		int i;
		int l;
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
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(s[i]).length();
			for (j = 0;j < l;j++)
			{
				if (s[i][j] == 'A')
				{
					s[i][j] = 'T';
				}
				else if (s[i][j] == 'T')
				{
					s[i][j] = 'A';
				}
				else if (s[i][j] == 'G')
				{
					s[i][j] = 'C';
				}
				else if (s[i][j] == 'C')
				{
					s[i][j] = 'G';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}

		return 0;
	}

}

