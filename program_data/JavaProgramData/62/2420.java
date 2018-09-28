package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[1000]);
	public static int i = 0;
	public static int Main()
	{
		c = tangible.StringFunctions.changeCharacter(c, 0, ConsoleInput.readToWhiteSpace(true));
		System.out.print(c.charAt(0));
		while (c.charAt(i) != '\n')
		{
			i++;
			c = tangible.StringFunctions.changeCharacter(c, i, System.in.read());

		}


		i = 1;
		while (c.charAt(i) != '\n')
		{


			if (c.charAt(i) == ' ')
			{
					++i;
					continue;
			}
			if (c.charAt(i) != '\0' && c.charAt(i - 1) != ' ')
			{
				System.out.print(c.charAt(i));
			}
			if (c.charAt(i) != '\0' && c.charAt(i - 1) == ' ')
			{
				System.out.print(" ");
				System.out.print(c.charAt(i));
			}
			i++;
		}

		return 0;
	}


}

