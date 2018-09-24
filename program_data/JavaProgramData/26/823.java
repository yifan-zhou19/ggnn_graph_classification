package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[101]);
		zfc = new Scanner(System.in).nextLine();
			for (int j = 0;j <= 99;j++)
			{
				while (zfc.charAt(j) == zfc.charAt(j + 1) && zfc.charAt(j) == ' ')
				{
					for (int i = j;i <= 99;i++)
					{
						zfc = tangible.StringFunctions.changeCharacter(zfc, i, zfc.charAt(i + 1));
					}
				}
			}
			System.out.printf("%s",zfc);
			return 0;
	}

}

