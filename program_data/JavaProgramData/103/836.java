package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int len;
		int i;
		int j;
		int t;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = s.length();
		i = 0;
		t = 0;
		while (i < len)
		{
			if (s.charAt(i + 1) == s.charAt(i) || s.charAt(i + 1) == s.charAt(i) + 32 || s.charAt(i + 1) == s.charAt(i) - 32)
			{
				i++;
				t++;
				continue;
			}
			if (s.charAt(i + 1) != s.charAt(i))
			{
				if (s.charAt(i) >= 'a')
				{
					s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
					System.out.print("(");
					System.out.print(s.charAt(i));
					System.out.print(",");
					System.out.print(t + 1);
					System.out.print(")");
					t = 0;
					i = i + 1;
					continue;
				}
				if (s.charAt(i) < 'a')
				{
					System.out.print("(");
					System.out.print(s.charAt(i));
					System.out.print(",");
					System.out.print(t + 1);
					System.out.print(")");
					t = 0;
					i = i + 1;
					continue;
				}
			}
		}
		return 0;
	}
}

