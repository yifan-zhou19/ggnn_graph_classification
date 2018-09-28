package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String zfc = new String(new char[1000]);
		String a = new String(new char[1000]);
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, j, zfc.charAt(i));
				j++;
			}
			else if (zfc.charAt(i + 1) == ' ')
			{
				continue;
			}
			else
			{
			 a = tangible.StringFunctions.changeCharacter(a, j, zfc.charAt(i));
				j++;
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, j, '\0');
		System.out.printf("%s\n", a);
		return 0;
	}
}

