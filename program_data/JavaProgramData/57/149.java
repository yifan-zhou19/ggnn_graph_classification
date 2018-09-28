package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] words =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'},
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		//	gets(words[i]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				words[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(words[i]).length();
			if (words[i][l - 2] == 101)
			{
				words[i][l - 2] = 0;
				words[i][l - 1] = 0;
				System.out.printf("%s\n",words[i]);
			}
			else if (words[i][l - 2] == 108)
			{
				words[i][l - 2] = 0;
				words[i][l - 1] = 0;
				System.out.printf("%s\n",words[i]);
			}
			else if (words[i][l - 3] == 105)
			{
				words[i][l - 3] = 0;
				words[i][l - 2] = 0;
				words[i][l - 1] = 0;
				System.out.printf("%s\n",words[i]);
			}

		}
	}
}

