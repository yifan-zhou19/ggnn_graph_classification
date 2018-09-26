package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[100]);
		String y = new String(new char[100]);
		int i;
		int k;
		int t;
		x = new Scanner(System.in).nextLine();
		k = 0;
		t = x.length();
		for (i = 0;i < t;i++)
		{
			if (x.charAt(i) != ' ')
			{
				y = tangible.StringFunctions.changeCharacter(y, k, x.charAt(i));
				k = k + 1;
			}
			if (x.charAt(i) == ' ' && x.charAt(i + 1) != ' ')
			{
				y = tangible.StringFunctions.changeCharacter(y, k, x.charAt(i));
				k = k + 1;
			}
		}
		y = tangible.StringFunctions.changeCharacter(y, k, '\0');
		System.out.println(y);
		return 0;
	}

}

