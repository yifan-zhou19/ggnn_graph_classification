package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] s = new char[1000][256];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			for (j = 0;j <= 255;j++)
			{
				if (s[i][j] == 'A')
				{
					s[i][j] = 'T';
				}
				else if (s[i][j] == 'T')
				{
					s[i][j] = 'A';
				}
				else if (s[i][j] == 'C')
				{
					s[i][j] = 'G';
				}

				else if (s[i][j] == 'G')
				{
					s[i][j] = 'C';
				}
			}

			System.out.println(s[i]);
		}
		return 0;
	}

}

