package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[500]);
		zfc = new Scanner(System.in).nextLine();
		int i;
		int k;
		int LEN;
		LEN = zfc.length();
		for (i = 0;i < LEN - 1;i++)
		{
			if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) == ' ')
			{
				for (k = i + 1;k < LEN - 1;k++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, k, zfc.charAt(k + 1));
				}
				i = i - 1;
				zfc = tangible.StringFunctions.changeCharacter(zfc, LEN - 1, '\0');
			}

			LEN = zfc.length();
		}

		System.out.println(zfc);
		return 0;
	}
}

