package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[2][80];
		int i;
		int j;
		for (i = 0;i < 2;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			for (j = 0;j < 80;j++)
			{
				if (s[i][j] <= 'Z' && s[i][j] >= 'A')
				{
					s[i][j] = s[i][j] + 32;
				}
			}
		}
		if (strcmp(s[0],s[1]) > 0)
		{
			System.out.print(">\n");
		}
		if (strcmp(s[0],s[1]) < 0)
		{
			System.out.print("<\n");
		}
		if (strcmp(s[0],s[1]) == 0)
		{
			System.out.print("=\n");
		}
	}
}
