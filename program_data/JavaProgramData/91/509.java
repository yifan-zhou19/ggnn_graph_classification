package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		String x = new String(new char[105]);
		String y = new String(new char[105]);
		x = new Scanner(System.in).nextLine();
		l = x.length();
		for (i = 0;i < l - 1;i++)
		{
			y = tangible.StringFunctions.changeCharacter(y, i, x.charAt(i) + x.charAt(i + 1));
		}
		y = tangible.StringFunctions.changeCharacter(y, l - 1, x.charAt(l - 1) + x.charAt(0));
		y = tangible.StringFunctions.changeCharacter(y, l, '\0');
		System.out.printf("%s",y);
		return 0;
	}

}

