package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[150]);
		String y = new String(new char[150]);
		int i;
		x = new Scanner(System.in).nextLine();
		for (i = 0;i <= 120;i++)
		{
			y = y.substring(0, i);
		}
		for (i = 0;i < x.length() - 1;i++)
		{
			y = tangible.StringFunctions.changeCharacter(y, i, x.charAt(i) + x.charAt(i + 1));
		}
		y = tangible.StringFunctions.changeCharacter(y, x.length() - 1, x.charAt(0) + x.charAt(x.length() - 1));
		System.out.printf("%s",y);
		return (0);
	}

}

