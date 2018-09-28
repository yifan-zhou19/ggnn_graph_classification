package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[105]);
		a = new Scanner(System.in).nextLine();
		int u;
		for (u = 0;a.charAt(u) != '\0';u++)
		{
		for (i = 0;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (j = i + 1;a.charAt(j) != '\0';j++)
				{
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
			}
			if (a.charAt(i) == '.' && a.charAt(i + 1) == ' ')
			{
				for (j = i + 1;a.charAt(j) != '\0';j++)
				{
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
			}
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == '.')
			{
				for (j = i;a.charAt(j) != '\0';j++)
				{
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
			}
		}
		}
		System.out.println(a);
		return 0;
	}
}

