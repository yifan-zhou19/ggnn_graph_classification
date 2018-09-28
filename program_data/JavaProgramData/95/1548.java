package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static daxie(String s)
	{
		int len;
		int i;
		int j;
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s[i].compareTo('A') >= 0 && s[i].compareTo('Z') <= 0)
			{
				s[i] = s[i] + 'a'-'A';
			}
		}
		return;
	}

	public static int Main()
	{
		String s1 = new String(new char[90]);
		String s2 = new String(new char[90]);
		int c;


		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();

		daxie(s1);
		daxie(s2);

		c = strcmp(s1,s2);
		if (c == -1)
		{
			System.out.print("<");
		}
		if (c == 0)
		{
			System.out.print("=");
		}
		if (c == 1)
		{
			System.out.print(">");
		}
	}

}
