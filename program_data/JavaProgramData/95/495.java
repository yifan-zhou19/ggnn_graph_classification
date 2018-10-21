package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[2][81];
		int i;
		int j;
		int k;
		for (i = 0;i < 2;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			for (j = 0;s[i][j] != '\0';j++)
			{
				if ((s[i][j] >= 'a') && (s[i][j] <= 'z'))
				{
					s[i][j] = s[i][j] - 32;
				}
			}
		}
		k = strcmp(s[0],s[1]);

		if (k > 0)
		{
			System.out.print(">");
		}
		if (k == 0)
		{
			System.out.print("=");
		}
		if (k < 0)
		{
			System.out.print("<");
		}
	}

}
