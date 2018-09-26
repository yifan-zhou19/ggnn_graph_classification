package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zx = new String(new char[100]);

		int len;
		zx = new Scanner(System.in).nextLine();
		len = zx.length();
		String sj = new String(new char[100]);
		int i = 0;
		int j = 0;
		while (i < len)
		{
			if (zx.charAt(i) != ' ')
			{
				sj = tangible.StringFunctions.changeCharacter(sj, j, zx.charAt(i));
				j++;
				i++;
			}
			else if (zx.charAt(i) == ' ' && zx.charAt(i + 1) != ' ')
			{
				sj = tangible.StringFunctions.changeCharacter(sj, j, zx.charAt(i));
				i++;
				j++;
			}
			else if (zx.charAt(i) == ' ' && zx.charAt(i + 1) == ' ')
			{
				i++;
			}
		}
		sj = tangible.StringFunctions.changeCharacter(sj, j, '\0');
		System.out.println(sj);
		return 0;
	}
}

