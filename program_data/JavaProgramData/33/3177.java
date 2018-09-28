package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str1 = new char[1000][256];
		char[][] str2 = new char[1000][256];
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
			str1[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;str1[i][j] != '\0';j++)
			{
				if (str1[i][j] == 'A')
				{
					str2[i][j] = 'T';
				}
				else if (str1[i][j] == 'G')
				{
					str2[i][j] = 'C';
				}
				else if (str1[i][j] == 'C')
				{
					str2[i][j] = 'G';
				}
				else if (str1[i][j] == 'T')
				{
					str2[i][j] = 'A';
				}
			}
			str2[i][j] = '\0';
			System.out.println(str2[i]);

		}
		return 0;
	}

}

