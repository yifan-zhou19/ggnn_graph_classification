package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[50][50];
		char t1;
		char t2;
		int n;
		int i;
		int l;
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
			l = String.valueOf(word[i]).length();
			if (word[i][l - 1] == 'r' && word[i][l - 2] == 'e')
			{
				word[i][l - 1] = '\0';
				word[i][l - 2] = '\0';
			}
			else if (word[i][l - 1] == 'y' && word[i][l - 2] == 'l')
			{
				word[i][l - 1] = '\0';
				word[i][l - 2] = '\0';
			}
			else if (word[i][l - 1] == 'g' && word[i][l - 2] == 'n' && word[i][l - 3] == 'i')
			{
				word[i][l - 1] = '\0';
				word[i][l - 2] = '\0';
				word[i][l - 3] = '\0';
			}
			System.out.printf("%s\n",word[i]);
		}
		return (0);
	}

}

