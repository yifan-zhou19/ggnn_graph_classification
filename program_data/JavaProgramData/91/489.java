package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		final String r = "";
		s = new Scanner(System.in).nextLine();
		int n;
		n = s.length();
		for (int i = 0;i < n;i++)
		{
			int a;
			if (i != n - 1)
			{
				a = s.charAt(i) + s.charAt(i + 1);
				r = tangible.StringFunctions.changeCharacter(r, i, a);
			}
			else
			{
				a = s.charAt(0) + s.charAt(i);
				r = tangible.StringFunctions.changeCharacter(r, i, a);
			}
		}
		System.out.println(r);
		return 0;
	}
}

