package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[2][80];
		int i;
		int j;
		int a;
		s[0] = new Scanner(System.in).nextLine();
		s[1] = new Scanner(System.in).nextLine();
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < 80;j++)
			{
				if (s[i][j] >= 'a' && s[i][j] <= 'z')
				{
					s[i][j] = s[i][j] - 32;
				}
			}
		}
		a = strcmp(s[0],s[1]);
		if (a > 0)
		{
			System.out.print(">");
		}
		else
		{
			if (a < 0)
			{
				System.out.print("<");
			}
			else
			{
				System.out.print("=");
			}
		}
	}
}
