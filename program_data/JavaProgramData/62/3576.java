package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int x;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			j++;
			}
			else if (a.charAt(i) == ' ')
			{
			for (x = 0;a.charAt(i) == ' ';i++)
			{
				x++;
			}
			if (x >= 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, ' ');
			j++;
			i = i - 1;
			}
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.printf("%s",b);
		return 0;
	}
}

