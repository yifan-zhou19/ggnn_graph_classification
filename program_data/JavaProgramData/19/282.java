package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int la; // Length of string a,b
		int lb;
		String p; // position
		String t = new String(new char[101]);
		String ss; // position in s move right one-way

		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		la = a.length();
		lb = b.length();
		ss = s;
		while ((p = tangible.StringFunctions.strStr(ss, a)) != null)
		{
			if ((p == s || *(p - 1) == ' ') && (*(p.Substring(la)) == ' '))
			{
				t = p.Substring(la) + 1;
				p = b;
				*(p.Substring(lb)) = ' ';
				p.Substring(lb) + 1 = t;
			}
			if ((p == s || *(p - 1) == ' ') && (*(p.Substring(la)) == '\0'))
			{
				p = b;
				*(p.Substring(lb)) = '\0';
			}
			ss = p.Substring(la) + 1;
		}
		System.out.println(s);

		return 0;
	}
}

