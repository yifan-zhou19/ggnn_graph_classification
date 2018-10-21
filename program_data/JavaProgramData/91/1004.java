package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String s1 = new String(new char[100]);
		int n;
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			"%d";
			a = s.charAt(i);
		}

		for (i = 0;i < n;i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, a.charAt(i) + a.charAt(i + 1));
		}
		s1 = tangible.StringFunctions.changeCharacter(s1, n - 1, a.charAt(0) + a.charAt(n - 1));
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",s1.charAt(i));
		}
		return 0;
	}

}

