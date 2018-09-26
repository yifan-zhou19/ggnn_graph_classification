package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		int p = 0;
		String zfc = new String(new char[101]);
		zfc = new Scanner(System.in).nextLine();
		k = zfc.length();
		for (i = 0;i < k;i++)
		{
			if ((zfc.charAt(i) == ' ') && (zfc.charAt(i + 1) == ' '))
			{
				for (j = i;j < k - 1;j++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, j, zfc.charAt(j + 1));
				}
				i--;
				p++;
			}
		}
		zfc = zfc.substring(0, k - p);

		System.out.printf("%s",zfc);
		return 0;
	}

}

