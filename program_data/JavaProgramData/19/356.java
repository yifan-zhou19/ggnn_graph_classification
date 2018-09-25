package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[150]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		q = s;
		while (tangible.StringFunctions.strStr(q,a) != null)
		{
			p = tangible.StringFunctions.strStr(q,a);
		*p = '\0';
		if ((*(p - 1) != ' ') && ((p - 1) > s) || (*(p + a.length()) != ' ') && (p + a.length() < s + s.length()))
		{
			System.out.printf("%s%s",q,a);
		}
		else
		{
			System.out.printf("%s%s",q,b);
		}
		p += a.length();
		q = p;
		}
		System.out.printf("%s",q);
	}

}

