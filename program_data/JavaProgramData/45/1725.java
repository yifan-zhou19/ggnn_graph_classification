package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sw = new String(new char[101]);
		sw = new Scanner(System.in).nextLine();
		int lsw = sw.length();

		String s = new String(new char[51]);
		String w = new String(new char[51]);

		int i;
		for (i = 0;i < lsw;i++)
		{
			if (sw.charAt(i) != ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, sw.charAt(i));
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				i++;
				break;
			}
		}
		int i0 = i;
		while (i < lsw)
		{
			w = tangible.StringFunctions.changeCharacter(w, i - i0, sw.charAt(i));
			i++;
		}
		w = tangible.StringFunctions.changeCharacter(w, i - i0, '\0');

		int lw = w.length();
		int ls = s.length();

		int t = 0;

		String e = new String(new char[51]);
		while (t < lw)
		{
			if (w.charAt(t) != s.charAt(0))
			{
			e = tangible.StringFunctions.changeCharacter(e, t, w.charAt(t));
			t++;
			}
			else
			{
				e = tangible.StringFunctions.changeCharacter(e, t, '\0');
				break;
			}
		}
		System.out.printf("%d",e.length());
		return 0;
	}
}

