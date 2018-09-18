package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[2][101];
		char c;
		int i;
		int len;
		int flag = 0;
		int count = 0;
		while (scanf("%s",s[0]) != EOF)
		{
			len = String.valueOf(s[0]).length();
			for (i = 0;i < len;i++)
			{
				c = s[0][i];
				if (c == '(')
				{
					flag++;
				}
				if (c == ')')
				{
					flag--;
				}
				if (flag >= 0)
				{
					s[1][i] = ' ';
					continue;
				}
				if (flag < 0)
				{
					s[1][i] = '?';
					flag = 0;
				}
			}
			flag = 0;
			for (i = len - 1;i >= 0;i--)
			{
				c = s[0][i];
				if (c == ')')
				{
					flag++;
				}
				if (c == '(')
				{
					flag--;
				}
				if (flag < 0)
				{
					s[1][i] = '$';
					flag = 0;
				}
			}
			flag = 0;
			s[1][len] = '\0';
			System.out.println(s[0]);
			System.out.println(s[1]);
			for (i = 0;i < len;i++)
			{
				s[0][i] = s[1][i] = 0;
			}
		}
		return 0;
	}

}
