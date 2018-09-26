package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[101]);
		zfc = new Scanner(System.in).nextLine();
		int n = zfc.length();
		for (int i = 0;i < n - 1;i++)
		{
			while (zfc.charAt(i) == zfc.charAt(i + 1) && zfc.charAt(i) == ' ')
			{
				for (int j = i;j <= 99;j++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, j, zfc.charAt(j + 1));
				}
			}
		}
		System.out.printf("%s",zfc);
		return 0;
	}
}

