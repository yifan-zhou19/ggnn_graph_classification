package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int k;
		char m;
		String s = new String(new char[300]);
		String a = new String(new char[1]);
		String b = new String(new char[1]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (k = 0;k < n - 2;k++)
		{
			for (i = 1;i < n - k;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, 0, s.charAt(i));
	b = tangible.StringFunctions.changeCharacter(b, 0, s.charAt(i - 1));
				if (strcmp(a,b) < 0)
				{
					m = s.charAt(i);
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i - 1));
					s = tangible.StringFunctions.changeCharacter(s, i - 1, m);
				}
			}
		}

		t = 1;
		m = s.charAt(0);
		for (i = 1;i < n;i++)
		{
			if (s.charAt(i) == s.charAt(i - 1))
			{
				m = s.charAt(i);
				t = t + 1;
			}
			else if (s.charAt(i) != s.charAt(i - 1))
			{
				a = tangible.StringFunctions.changeCharacter(a, 0, m);
				if ((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z'))
				{
					System.out.printf("%c=%d\n",m,t);
					k = 0;
				}
				m = s.charAt(i);
				t = 1;
			}
		}
		if ((a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z'))
		{
			System.out.printf("%c=%d\n",m,t);
			k = 0;
		}
			if (k != 0)
			{
				System.out.print("No");
			}
			return 0;
	}



}

