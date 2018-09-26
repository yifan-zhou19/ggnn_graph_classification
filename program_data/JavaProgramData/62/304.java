package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j = 0;
	int a;
	String s = new String(new char[200]);
	String m = new String(new char[200]);
	s = new Scanner(System.in).nextLine();
	a = s.length();
	for (i = 0;i <= a - 1;i++)
	{
		if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
		{
			s = tangible.StringFunctions.changeCharacter(s, i, '0');
		}
	}
	for (i = 0;i <= a - 1;i++)
	{
			if (s.charAt(i) != '0')
			{
				m = tangible.StringFunctions.changeCharacter(m, j, s.charAt(i));
				j++;
			}
	}
	System.out.println(m);
	return 0;
	}
}

