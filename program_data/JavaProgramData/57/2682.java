package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[50][30];
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][String.valueOf(s[i]).length() - 1] == 'y' && s[i][String.valueOf(s[i]).length() - 2] == 'l')
			{
				s[i][String.valueOf(s[i]).length() - 2] = '\0';
			}
			else if (s[i][String.valueOf(s[i]).length() - 1] == 'r' && s[i][String.valueOf(s[i]).length() - 2] == 'e')
			{
				s[i][String.valueOf(s[i]).length() - 2] = '\0';
			}
			else if (s[i][String.valueOf(s[i]).length() - 1] == 'g' && s[i][String.valueOf(s[i]).length() - 2] == 'n' && s[i][String.valueOf(s[i]).length() - 3] == 'i')
			{
				s[i][String.valueOf(s[i]).length() - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(s[i]);
		}
	}
}

