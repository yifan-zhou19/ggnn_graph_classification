package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		char[][] s = new char[10000][256];
		char[][] sd = new char[10000][256];
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
			for (k = 0;s[i][k] != '\0';k++)
			{
				if (s[i][k] == 'A')
				{
					sd[i][k] = 'T';
				}
				if (s[i][k] == 'T')
				{
					sd[i][k] = 'A';
				}
				if (s[i][k] == 'C')
				{
					sd[i][k] = 'G';
				}
				if (s[i][k] == 'G')
				{
					sd[i][k] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",sd[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

