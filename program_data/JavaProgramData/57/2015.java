package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int tmpl;
		char[][] word = new char[50][50];

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
			tmpl = String.valueOf(word[i]).length();
			if (word[i][tmpl - 1] == 'r' || word[i][tmpl - 1] == 'y')
			{
				word[i][tmpl - 2] = '\0';
			}
			else if (word[i][tmpl - 1] == 'g')
			{
				word[i][tmpl - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",word[i]);
		}
	}

}

