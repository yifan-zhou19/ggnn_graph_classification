package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		String d;
		String e;
		String f;
		String g;
		int i;
		a = new Scanner(System.in).nextLine();
		g = a;
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		d = tangible.StringFunctions.strStr(a,b);
		if (d == null)
		{
			System.out.printf("%s",g);
			System.exit(0);
		}
		f = a;
		i = a.length() - d.length();
		f.charAt(i) = '\0';
		e = a + (a.length() - (d.length() - b.length()));
		System.out.printf("%s%s%s\n",f,c,e);
		return 0;
	}


}

