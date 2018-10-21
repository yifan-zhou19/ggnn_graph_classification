package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] z = new char[1000][1000];
		char[][] s = new char[1000][1000];
		int n;
		int i;
		int k;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (k = 0;z[i][k] != 0;k++)
			{
				if (z[i][k] == 'A')
				{
					s[i][k] = 'T';
				}
				if (z[i][k] == 'T')
				{
					s[i][k] = 'A';
				}
				if (z[i][k] == 'C')
				{
					s[i][k] = 'G';
				}
				if (z[i][k] == 'G')
				{
					s[i][k] = 'C';
				}
			}
		}
			for (i = 0;i <= n - 1;i++)
			{
			System.out.printf("%s\n",s[i]);
			}
		return 0;
	}
}

