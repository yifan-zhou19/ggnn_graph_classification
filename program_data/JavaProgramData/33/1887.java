package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		char[][] s = new char[1000][300];
		char[][] ds = new char[1000][300];
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
			l = String.valueOf(s[i]).length();
			for (j = 0;j < l;j++)
			{
				if (s[i][j] == 'A')
				{
					ds[i][j] = 'T';
				}
				if (s[i][j] == 'T')
				{
					ds[i][j] = 'A';
				}
				if (s[i][j] == 'G')
				{
					ds[i][j] = 'C';
				}
				if (s[i][j] == 'C')
				{
					ds[i][j] = 'G';
				}
			}
			ds[i][l] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(ds[i]);
		}
		return 0;
	}
}

