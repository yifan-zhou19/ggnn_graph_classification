package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[101]);
		int i;
		zf = new Scanner(System.in).nextLine();
		int l;
		l = zf.length();
		for (i = 0;i < l;i++)
		{
			if (zf.charAt(i) == ' ')
			{
			   if (zf.charAt(i + 1) == ' ')
			   {
				  zf = tangible.StringFunctions.changeCharacter(zf, i + 1, '\0');
			   }
			}
			if (zf.charAt(i) == '\0')
			{
			   if (zf.charAt(i + 1) == ' ')
			   {
				  zf = tangible.StringFunctions.changeCharacter(zf, i + 1, '\0');
			   }
			}
			if (zf.charAt(i) != '\0')
			{
			   System.out.printf("%c",zf.charAt(i));
			}
		}
		return 0;
	}
}

