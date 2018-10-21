package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[200]);
	cin.get(s,200);
	int n = s.length();

	for (int i = 0;i < n;i++)
	{
		if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
		{
		s = tangible.StringFunctions.changeCharacter(s, i, '\0');
		}
	}
	for (int i = 0;i < n;i++)
	{
		if (s.charAt(i) == 0)
		{
			continue;
		}
		System.out.print(s.charAt(i));
	}



	return 0;
	}
}

