package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[100][100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			int k = String.valueOf(s[i]).length();
			int j;
			if (s[i][k - 1] == 'r' && s[i][k - 2] == 'e')
			{
				for (j = 0;j < k - 2;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			else if (s[i][k - 1] == 'y' && s[i][k - 2] == 'l')
			{
				for (j = 0;j < k - 2;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			else if (s[i][k - 1] == 'g' && s[i][k - 2] == 'n' && s[i][k - 3] == 'i')
			{
				for (j = 0;j < k - 3;j++)
				{
					System.out.printf("%c",s[i][j]);
				}
			}
			else
			{
				System.out.printf("%s",s[i]);
			}
			System.out.print("\n");
		}
	}

}

