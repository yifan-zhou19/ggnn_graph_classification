package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] bg = new char[60][40];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bg[i] = tempVar2.charAt(0);
			}
		}
		for (int i = 0;i < n;i++)
		{
			l = String.valueOf(bg[i]).length();
			if (strcmp(bg[i][l - 3], "ing") == 0)
			{
				bg[i][l - 3] = '\0';
			}
			else if (strcmp(bg[i][l - 2], "er") == 0 || strcmp(bg[i][l - 2], "ly") == 0)
			{
				bg[i][l - 2] = '\0';
			}
		}
		for (int i = 0;i < n;i++)
		{
		System.out.printf("%s\n",bg[i]);
		}
		return 0;
	}

}

