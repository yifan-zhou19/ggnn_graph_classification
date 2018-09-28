package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String q = new String(new char[100]);
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		char lenb;
		char I;
		String c;
		int i;
		q = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		lenb = b.length();
		   c = tangible.StringFunctions.strStr(q,a);
		if (c != null)
		{
			c = b.substring(0, lenb);
			System.out.println(q);
		}
		else if (c == null)
		{
			System.out.println(q);
		}
	}
}

