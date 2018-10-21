package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[255]);
		String sc = new String(new char[255]);
		int i;
		int j = 0;
		int s = 0;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) != ' ' || (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' '))
			{
				sc = tangible.StringFunctions.changeCharacter(sc, j, zfc.charAt(i));
				j++;
				s++;
			}
		}
		sc = tangible.StringFunctions.changeCharacter(sc, s, '\0');
		System.out.println(sc);
		return 0;
	}


}

