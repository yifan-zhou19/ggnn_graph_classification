package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int i = 0;
		String y = new String(new char[1001]);
		String h = new String(new char[1001]);
		y = new Scanner(System.in).nextLine();
		for (i = 0;y.charAt(i) != '\0';i++)
		{
			if (y.charAt(i) != ' ')
			{
				  h = tangible.StringFunctions.changeCharacter(h, m, y.charAt(i));
				  m++;
			}
			else if (y.charAt(i) == ' ' && y.charAt(i + 1) != ' ')
			{
				 h = tangible.StringFunctions.changeCharacter(h, m, ' ');
				 m++;
			}
			else
			{
				continue;
			}
		}
		h = tangible.StringFunctions.changeCharacter(h, m, '\0');
		System.out.print(h);
		System.out.print("\n");
		return 0;
	}

}

