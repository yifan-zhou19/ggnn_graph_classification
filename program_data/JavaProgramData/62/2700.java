package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int c = 0;
		String zfc = new String(new char[1000]);
		String zfc2 = new String(new char[1000]);
		zfc = new Scanner(System.in).nextLine();
		a = zfc.length();
		for (i = 0;i < 1000;i++)
		{
							zfc2 = tangible.StringFunctions.changeCharacter(zfc2, i, ' ');
		}
		for (i = 0;i < a;i++)
		{
						 if (zfc.charAt(i) != ' ')
						 {
									  zfc2 = tangible.StringFunctions.changeCharacter(zfc2, c, zfc.charAt(i));
									  c++;
						 }
						 if (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' ')
						 {
									  zfc2 = tangible.StringFunctions.changeCharacter(zfc2, c, zfc.charAt(i));
									  c++;
						 }
		}
		zfc2 = tangible.StringFunctions.changeCharacter(zfc2, c, '\0');
		System.out.println(zfc2);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		return 0;
	}
}

