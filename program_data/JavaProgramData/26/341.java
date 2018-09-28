package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[101]);
		String d = new String(new char[101]);
		String e = new String(new char[250]);
		e = tangible.StringFunctions.changeCharacter(e, 0, '\0');
		a = new Scanner(System.in).nextLine();
		a += " ";
		for (i = 0;a.charAt(i) != '\0';)
		{
			if (a.charAt(i) != ' ')
			{
				for (j = i;a.charAt(j) != ' ';)

				{
					d = tangible.StringFunctions.changeCharacter(d, j - i, a.charAt(j));
					j++;
				}

				d = tangible.StringFunctions.changeCharacter(d, j - i, '\0');

				e += d;
				if (a.charAt(j + 1) != '\0')
				{
					e += " ";
				}
				i = j + 1;
			}
			else
			{
				i++;
			}

		}
		System.out.println(e);
		return 0;
	}



}

