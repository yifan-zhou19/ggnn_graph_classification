package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[150]);
		final String word = "";
		int k;
		int m;
		int n;
		int i;
		int j;
		String point;
		s = new Scanner(System.in).nextLine();
		k = s.length();
		point = s.charAt(0);
		for (i = 0;i <= k - 2;i++)
		{
			word = tangible.StringFunctions.changeCharacter(word, i, *(point.Substring(i)) + (*(point.Substring(i) + 1)));
		}
		word = tangible.StringFunctions.changeCharacter(word, k - 1, s.charAt(0) + s.charAt(k - 1));
		System.out.println(word);
		return 0;
	}
}

