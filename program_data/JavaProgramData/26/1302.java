package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		String zfc = new String(new char[1000]);
		String jg = new String(new char[1000]);
		zfc = new Scanner(System.in).nextLine();
		m = 0;
		for (i = 0; zfc.charAt(i) != '\0'; i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				jg = tangible.StringFunctions.changeCharacter(jg, m, zfc.charAt(i));
				m++;
			}
			else if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) != ' ')
			{
				jg = tangible.StringFunctions.changeCharacter(jg, m, zfc.charAt(i));
				m++;
			}
		}
				jg = tangible.StringFunctions.changeCharacter(jg, m, '\0');
				System.out.printf("%s\n",jg);
		return 0;
	}

}

