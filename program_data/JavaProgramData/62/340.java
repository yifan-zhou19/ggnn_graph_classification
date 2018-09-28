package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[201]);
	int k;
	int i;
	int j;
	int m;
	int n;
	s = new Scanner(System.in).nextLine();
	k = s.length();
	for (i = 0;i < k;i++)
	{
		if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
		{
			for (m = i + 1;m < k;m++)
			{
				s = tangible.StringFunctions.changeCharacter(s, m, s.charAt(m + 1));
				i--;
			}
		}
		else
		{
			continue;
		}
	}
	System.out.printf("%s", s);

	return 0;
	}

}

