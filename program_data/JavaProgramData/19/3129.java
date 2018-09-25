package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[201]);
		String a = new String(new char[201]);
		String b = new String(new char[201]);
		String c = new String(new char[201]);
		int i;
		int j;
		int la;
		int lb;
		int k;
		int t;
		int ls;
		s = new Scanner(System.in).nextLine();
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		la = a.length(),lb = b.length(),ls = s.length();
		for (i = 0;i < 100;i = i + 1)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, s.charAt(i));
		}
		t = 0;
		for (i = 0;i < ls;i = i + 1)
		{
			if (s.charAt(i) == '\0')
			{
				break;
			}
			for (j = 0;j < la;j = j + 1)
			{
				if (s.charAt(i + j) != a.charAt(j))
				{
					break;
				}
			}
			if (j == la && (s.charAt(i + la) == ' ' || s.charAt(i + la) == '\0') && (s.charAt(i - 1) == ' ' || i == 0))
			{

				for (k = 0;k < lb;k = k + 1)
				{
					s = tangible.StringFunctions.changeCharacter(s, i + k, b.charAt(k));
				}
				for (k = 0;k < 100;k = k + 1)
				{
					s = tangible.StringFunctions.changeCharacter(s, i + lb + k, c.charAt(i + la + t * (la - lb) + k));
				}
				t = t + 1;
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}


}

