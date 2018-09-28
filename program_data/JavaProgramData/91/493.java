package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m1;
		int i;
		String zfc1 = new String(new char[200]);
		String zfc2 = new String(new char[200]);
		zfc1 = new Scanner(System.in).nextLine();
		m1 = zfc1.length();
		for (i = 0;i < m1 - 1;i++)
		{
			zfc2 = tangible.StringFunctions.changeCharacter(zfc2, i, zfc1.charAt(i) + zfc1.charAt(i + 1));
		}
		zfc2 = tangible.StringFunctions.changeCharacter(zfc2, m1 - 1, zfc1.charAt(m1 - 1) + zfc1.charAt(0));
		for (i = 0;i < m1;i++)
		{
			System.out.printf("%c",zfc2.charAt(i));
		}
		return 0;
	}
}

