package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] word = new char[53][35];
		char[][] del = new char[53][35];
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
			if (word[i][String.valueOf(word[i]).length() - 1] == 'r')
			{
				for (j = 0;j < String.valueOf(word[i]).length() - 2;j++)
				{
					del[i][j] = word[i][j];
				}
			}
			else
			{
			if (word[i][String.valueOf(word[i]).length() - 1] == 'y')
			{
				for (j = 0;j < String.valueOf(word[i]).length() - 2;j++)
				{
					del[i][j] = word[i][j];
				}
			}
			else
			{
			if (word[i][String.valueOf(word[i]).length() - 1] == 'g')
			{
				for (j = 0;j < String.valueOf(word[i]).length() - 3;j++)
				{
					del[i][j] = word[i][j];
				}
			}
			}
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.println(del[i]);
		}

		return 0;
	}

}

