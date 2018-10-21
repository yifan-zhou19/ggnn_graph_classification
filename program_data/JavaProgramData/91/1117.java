package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[101]);
		String zfc2 = new String(new char[101]);
		int i;
		int k;
		zfc1 = new Scanner(System.in).nextLine();
		k = zfc1.length();
		for (i = 0;i < k;i++)
		{
			if (i != k - 1)
			{
				zfc2 = tangible.StringFunctions.changeCharacter(zfc2, i, zfc1.charAt(i + 1) + zfc1.charAt(i));
			}
			else
			{
				zfc2 = tangible.StringFunctions.changeCharacter(zfc2, k - 1, zfc1.charAt(k - 1) + zfc1.charAt(0));
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",zfc2.charAt(i));
		}
		return 0;
	}
}

