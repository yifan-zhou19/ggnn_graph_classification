package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String t = new String(new char[100]);
		char c;
		int i;
		int m;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
			}
		}
		for (i = 0;t.charAt(i) != '\0';i++)
		{
			if ((t.charAt(i) >= 'a') && (t.charAt(i) <= 'z'))
			{
				t = tangible.StringFunctions.changeCharacter(t, i, t.charAt(i) - 32);
			}
		}
		m = 1;
		for (i = 0;(t.charAt(i) != '\0') && (s.charAt(i) != '\0');i++)
		{
			if (s.charAt(i) > t.charAt(i))
			{
				System.out.print(">");
				m = 0;
				break;
			}
			else if (s.charAt(i) < t.charAt(i))
			{
				System.out.print("<");
				m = 0;
				break;
			}
		}
		if (m == 1)
		{
			System.out.print("=");
		}
		return 0;
	}
}

