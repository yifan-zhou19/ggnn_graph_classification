package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String c = new String(new char[120]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) == ' ' && c.charAt(i + 1) == ' ')
			{
				 for (j = (i + 1);c.charAt(j) == ' ';j++)
				 {
					 ;
				 }
				 for (k = 1;c.charAt(j + k - 1) != ' ' && c.charAt(j + k - 1) != '\0';k++)
				 {
					 c = tangible.StringFunctions.changeCharacter(c, i + k, c.charAt(j + k - 1));
					 c = tangible.StringFunctions.changeCharacter(c, j + k - 1, ' ');
				 }
				 if (c.charAt(j + k - 1) == '\0')
				 {
				 c = tangible.StringFunctions.changeCharacter(c, i + k, c.charAt(j + k - 1));
				 }
			}
		}
		System.out.printf("%s",c);
		System.in.read();
	}
}

