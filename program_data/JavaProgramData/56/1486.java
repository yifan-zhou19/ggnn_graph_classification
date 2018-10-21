package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[5]);
		String t = new String(new char[5]);
		int l = 0;
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0,j = l - 1;i<l,j >= 0;i++,j--)
		{
			t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i));
		}
		t = tangible.StringFunctions.changeCharacter(t, l, '\0');

		System.out.printf("%s",t);
			return 0;
	}
}

