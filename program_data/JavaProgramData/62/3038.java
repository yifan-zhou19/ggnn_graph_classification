package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int k;
		int b;
		String zfc = new String(new char[1000]);

		b = 0;
		zfc = new Scanner(System.in).nextLine();
		l = zfc.length();
		for (i = 0;i < l - 1;i++)
		{
			if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) == ' ')
			{
				for (k = i + 1;k < l - 1;k++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, k, zfc.charAt(k + 1));
				}
				i--;
				b++;
			}
		}
		if (b != 0)
		{
			zfc = zfc.substring(0, l - b);
		}
		System.out.printf("%s",zfc);

	return 0;
	}
}

