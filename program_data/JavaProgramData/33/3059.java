package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String z = new String(new char[256]);
		z = new Scanner(System.in).nextLine();
		for (int j = 0;j < n;j++)
		{
			z = new Scanner(System.in).nextLine();
			for (int i = 0;z.charAt(i) != '\0';i++)
			{
				if (z.charAt(i) == 'A')
				{
					z = tangible.StringFunctions.changeCharacter(z, i, 'T');
				}
				else if (z.charAt(i) == 'T')
				{
					z = tangible.StringFunctions.changeCharacter(z, i, 'A');
				}
				else if (z.charAt(i) == 'G')
				{
					z = tangible.StringFunctions.changeCharacter(z, i, 'C');
				}
				else if (z.charAt(i) == 'C')
				{
					z = tangible.StringFunctions.changeCharacter(z, i, 'G');
				}
			}
			System.out.println(z);
		}
		return 0;
	}
}

