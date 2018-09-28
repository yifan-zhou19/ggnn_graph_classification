package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		String z1 = new String(new char[256]);
		String z2 = new String(new char[256]);
		z1 = new Scanner(System.in).nextLine();
		for (int j = 0;j < n;j++)
		{
			z1 = new Scanner(System.in).nextLine();
			for (int i = 0;z1.charAt(i) != '\0';i++)
			{
				if (z1.charAt(i) == 'A')
				{
					z2 = tangible.StringFunctions.changeCharacter(z2, i, 'T');
				}
				else
				{
				if (z1.charAt(i) == 'T')
				{
					z2 = tangible.StringFunctions.changeCharacter(z2, i, 'A');
				}
				else
				{
				if (z1.charAt(i) == 'G')
				{
					z2 = tangible.StringFunctions.changeCharacter(z2, i, 'C');
				}
				else
				{
				if (z1.charAt(i) == 'C')
				{
					z2 = tangible.StringFunctions.changeCharacter(z2, i, 'G');
				}
				}
				}
				}
				z2 = z2.substring(0, i + 1);
			}
			System.out.println(z2);
		}
		return 0;
	}
}

