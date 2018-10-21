package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String zf1 = new String(new char[10000]);
		String zf2 = new String(new char[10000]);
		zf1 = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (zf1.charAt(i + 1) == '\0')
			{
				zf2 = tangible.StringFunctions.changeCharacter(zf2, i, zf1.charAt(0) + zf1.charAt(i));
				zf2 = tangible.StringFunctions.changeCharacter(zf2, i + 1, '\0');
				break;
			}
			zf2 = tangible.StringFunctions.changeCharacter(zf2, i, zf1.charAt(i) + zf1.charAt(i + 1));
		}
		for (i = 0;;i++)
		{
			if (zf2.charAt(i) == '\0')
			{
				break;
			}
			System.out.printf("%c",zf2.charAt(i));
		}
		return 0;
	}


}

