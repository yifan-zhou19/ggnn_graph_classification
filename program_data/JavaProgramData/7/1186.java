package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String p;
		String sub = new String(new char[50]);
		String q;
		String c;
		String rep = new String(new char[50]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = sub.length();
		p = s;
		q = sub;
		c = tangible.StringFunctions.strStr(p, q);
		if (c == null)
		{
			System.out.print(s);
			System.out.print("\n");
		}
		else
		{
			for (p; p < c; p++)
			{
				System.out.print(p);
			}
			System.out.print(rep);
			for (p = c.Substring(len); p != '\0'; p++)
			{
				System.out.print(p);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

