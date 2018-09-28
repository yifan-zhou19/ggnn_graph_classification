package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int j = 0;
		String zfc = new String(new char[202]);
		String mb = new String(new char[202]);
		zfc = new Scanner(System.in).nextLine();
		n = zfc.length();
		for (int i = 0;i < n;i++)
		{
			if (!(zfc.charAt(i) == ' ' && zfc.charAt(i + 1) == ' '))
			{
				 mb = tangible.StringFunctions.changeCharacter(mb, j, zfc.charAt(i));
				 j++;
			}
		}
		mb = tangible.StringFunctions.changeCharacter(mb, j, '\0');
		System.out.printf("%s",mb);
		return 0;
	}
}

