package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[101]);
		String jg = new String(new char[101]);
		int i;
		int m = 0;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				jg = tangible.StringFunctions.changeCharacter(jg, m, zfc.charAt(i));
				m += 1;
			}
			else if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) != ' ')
			{
				jg = tangible.StringFunctions.changeCharacter(jg, m, zfc.charAt(i));
				m += 1;
			}
			else
			{
				continue;
			}
		}
		 jg = tangible.StringFunctions.changeCharacter(jg, m, '\0');
		  System.out.printf("%s\n",jg);
		return 0;
	}




}

