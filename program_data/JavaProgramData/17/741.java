package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[11][101];
		String s0 = new String(new char[101]);
		int i = 0;
		int j;
		int k;
		int l;
		int c;
		while (i <= 10)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar.charAt(0);
			}
			s0 = s[i];
			l = String.valueOf(s[i]).length();
			for (j = l - 1;j >= 0;j--)
			{
				c = 0;
				if (s[i][j] == '(')
				{
					for (k = j;k <= l - 1;k++)
					{
						if (s[i][k] == ')')
						{
							c = 1;
							s[i][k] = ' ';
							s[i][j] = ' ';
							break;
						}
					}
					if (c == 0)
					{
						s[i][j] = '$';
					}
				}
				else if (s[i][j] != ')')
				{
					s[i][j] = ' ';
				}
			}
			for (j = 0;j <= l - 1;j++)
			{
				if (s[i][j] == ')')
				{
					s[i][j] = '?';
				}
			}
			for (j = 0;j <= l - 1;j++)
			{
				System.out.printf("%c",s0.charAt(j));
			}
			System.out.print("\n");
			for (j = 0;j <= l - 1;j++)
			{
				System.out.printf("%c",s[i][j]);
			}
			System.out.print("\n");
			i++;
		}
	}
}

