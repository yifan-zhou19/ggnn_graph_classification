package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		char[][] s = new char[2][81];
		s[0] = new Scanner(System.in).nextLine();
		s[1] = new Scanner(System.in).nextLine();
		for (i = 0;i <= 1;i++)
		{
			for (j = 0;j <= String.valueOf(s[i]).length() - 1;j++)
			{
				if (s[i][j] >= 'a' && s[i][j] <= 'z')
				{
					s[i][j] = s[i][j] - 32;
				}
			}
		}
		if (strcmp(s[0],s[1]) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(s[0],s[1]) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(s[0],s[1]) == 0)
		{
			System.out.print("=");
		}
	}
}
