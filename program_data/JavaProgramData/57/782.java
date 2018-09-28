package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] word = new char[51][33];
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
				word[i] = tempVar2.charAt(0);
			}

		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(word[i]).length();
			for (j = len;j > 0;j--)
			{

				if ((word[i][j] == 'r') && (word[i][j - 1] == 'e'))
				{
					word[i][j - 1] = '\0';
					break;
				}
				else if ((word[i][j] == 'y') && (word[i][j - 1] == 'l'))
				{
					word[i][j - 1] = '\0';
					break;
				}
				else if ((word[i][j] == 'g') && (word[i][j - 1] == 'n') && (word[i][j - 2] == 'i'))
				{
					word[i][j - 2] = '\0';
					break;
				}
			}
			System.out.printf("%s\n",word[i]);
		}
		return 0;

	}
}

