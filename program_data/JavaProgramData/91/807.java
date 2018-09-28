package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String s = new String(new char[105]);
		String c = new String(new char[105]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i + 1) != '\0';i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, s.charAt(i) + s.charAt(i + 1));
		}
		c = tangible.StringFunctions.changeCharacter(c, i, s.charAt(i) + s.charAt(0));
		c = tangible.StringFunctions.changeCharacter(c, i + 1, '\0');
		System.out.println(c);
	}

}

