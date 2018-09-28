package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int l = 0;
		String zfc = new String(new char[LEN]);
		String Friend = new String(new char[LEN]);
		zfc = new Scanner(System.in).nextLine();
		l = zfc.length();
		//printf("%d",l);
		for (i = 0;i < l;i++)
		{
			if (i + 1 < l)
			{
			  Friend = tangible.StringFunctions.changeCharacter(Friend, i, zfc.charAt(i) + zfc.charAt(i + 1));
			  System.out.printf("%c",Friend.charAt(i));
			}
			if (i == l - 1)
			{
			  Friend = tangible.StringFunctions.changeCharacter(Friend, i, zfc.charAt(i) + zfc.charAt(0));
			  System.out.printf("%c",Friend.charAt(i));
			}
		}
		return 0;
	}
}

