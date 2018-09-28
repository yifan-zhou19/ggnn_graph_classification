package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		char[][] word = new char[50][32];
		char j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			word[i] = new Scanner(System.in).nextLine();
			String.valueOf(word[i]).length();
			j = String.valueOf(word[i]).length();
			if (j > 2 && word[i][j - 2] == 'e' && word[i][j - 1] == 'r')
			{
				word[i][j - 2] = '\0';
			}
			else if (j > 2 && word[i][j - 2] == 'l' && word[i][j - 1] == 'y')
			{
				word[i][j - 2] = '\0';
			}
			else if (j > 3 && word[i][j - 3] == 'i' && word[i][j - 2] == 'n' && word[i][j - 1] == 'g')
			{
				word[i][j - 3] = '\0';
			}
		}
		for (i = 0;i <= n;i++)
		{
			System.out.printf("%s\n",word[i]);
		}
		return 0;
	}

}

