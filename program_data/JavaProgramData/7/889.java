package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		String p;
		String q;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = b.length();
		p = tangible.StringFunctions.strStr(a,b);
		q = a;
		if (p == null)
		{
			System.out.print(a);
		}
		else
		{
			while (q < p)
			{
			System.out.print(q);
			q = q.Substring(1);
			}
			q = p.Substring(len);
			System.out.print(c);
			while (q != '\0')
			{
			System.out.print(q);
				q = q.Substring(1);
			}
		}


		return 0;
	}








}

