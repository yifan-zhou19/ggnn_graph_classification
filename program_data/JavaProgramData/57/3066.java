package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int len;
		int j;
		char[][] s = new char[51][20];
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
			len = String.valueOf(s[i]).length();
			if (s[i][len - 1] == 'y' && s[i][len - 2] == 'l')
			{
				int j;
				for (j = 0;j < len - 2;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			else if (s[i][len - 1] == 'g' && s[i][len - 2] == 'n' && s[i][len - 3] == 'i')
			{
				int j;
				for (j = 0;j < len - 3;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			else if (s[i][len - 1] == 'r' && s[i][len - 2] == 'e')
			{
				int j;
				for (j = 0;j < len - 2;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			System.out.print("\n");
			}

	}
}

