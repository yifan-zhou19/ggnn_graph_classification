package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		i = 0;
		j = 0;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				j++;
				do
				{
					i++;
				} while (a.charAt(i) == ' ');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				i++;
				j++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.printf("%s",b);
		return 0;
	}
}

