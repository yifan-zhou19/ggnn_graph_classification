package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	char[][] word = new char[50][100];
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
		if ((word[i][String.valueOf(word[i]).length() - 2] == 'e') || (word[i][String.valueOf(word[i]).length() - 2] == 'l'))
		{
	word[i][String.valueOf(word[i]).length() - 2] = '\0';
		}
		else
		{
			word[i][String.valueOf(word[i]).length() - 3] = '\0';
		}
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%s\n",word[i]);
	}

		return 0;

	}

}

