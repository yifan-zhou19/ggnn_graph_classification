package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String y = new String(new char[101]);
		int i;
		int j = 0;
		int n;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if ((s.charAt(i) != ' ') || ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')))
			{
				y = tangible.StringFunctions.changeCharacter(y, j, s.charAt(i));
				j++;
			}
		}
		y = tangible.StringFunctions.changeCharacter(y, j, '\0');
		System.out.println(y);
		return 0;
	}


}

