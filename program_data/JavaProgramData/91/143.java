package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String p;
		String s1 = new String(new char[101]);
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n + 1;i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, '\0');
		}
	p = a;
		for (i = 0;i < n;i++)
		{
		if (i < n - 1)
		{
			 s1 = tangible.StringFunctions.changeCharacter(s1, i, *(p.Substring(i)) + *(p.Substring(i) + 1));
		}
		else
		{
		s1 = tangible.StringFunctions.changeCharacter(s1, i, *(p.Substring(i)) + p);
		}
	System.out.printf("%c",s1.charAt(i));
		}
			 return 0;
	}





}

