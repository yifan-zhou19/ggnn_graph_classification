package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char[][] str = new char[100][100];
		String a = new String(new char[100]);
		int n;
		int i;
		int l;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n + 1;i++)
		{
			l = String.valueOf(str[i]).length();
			if (str[i][l - 2] == 'e' && str[i][l - 1] == 'r')
			{
				for (j = 0;j < l - 2;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, str[i][j]);
				}
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				System.out.println(a);
			}
			if (str[i][l - 2] == 'l' && str[i][l - 1] == 'y')
			{
				for (j = 0;j < l - 2;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, str[i][j]);
				}
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				System.out.println(a);
			}
			if (str[i][l - 3] == 'i' && str[i][l - 2] == 'n' && str[i][l - 1] == 'g')
			{
				for (j = 0;j < l - 3;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, str[i][j]);
				}
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				System.out.println(a);
			}
		}
	}
}

