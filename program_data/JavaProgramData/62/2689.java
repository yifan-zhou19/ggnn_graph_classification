package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[105]);
		final String t = "";
		int i;
		int j = 0;
		int k = 0;
		int n;
		int m;

		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ')
			{
				k++;
			}
			if (k < 1)
			{
				t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i));
				j++;
			}
			k = 0;
		}
		m = t.length();
		for (i = 0;i < m;i++)
		{
		System.out.printf("%c",(int)t.charAt(i));
		}
		return 0;
	}
}

