package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		j = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j = j + 1;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j = j + 1;
				while (a.charAt(i + 1) == ' ')
				{
					i = i + 1;
				}
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.println(b);
	return 0;
	}
}

