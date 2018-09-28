package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		for (int i = 1;c.charAt(i) != '\0';i++)
		{
			if ((c.charAt(i - 1) == ' ') && (c.charAt(i) == ' '))
			{
				for (int j = i;c.charAt(j) != '\0';j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
				}
				i--;
			}
		}
		System.out.println(c);
		return 0;
	}

}

