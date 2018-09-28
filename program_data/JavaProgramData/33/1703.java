package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] Org = new char[1000][1000];
		char[][] res = new char[1000][1000];
		int n;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();
		for (i = 0 ; i < n ; i++)
		{
			Org[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0 ; i < n ; i++)
		{
			for (j = 0 ; Org[i][j] != '\0' ; j++)
			{
				if (Org[i][j] == 'A')
				{
					res[i][j] = 'T';
				}
				else if (Org[i][j] == 'T')
				{
					res[i][j] = 'A';
				}
				else if (Org[i][j] == 'G')
				{
					res[i][j] = 'C';
				}
				else if (Org[i][j] == 'C')
				{
					res[i][j] = 'G';
				}
			}
			res[i][j] = '\0';
			System.out.print(res[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

