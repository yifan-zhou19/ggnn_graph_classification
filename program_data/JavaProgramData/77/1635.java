package <missing>;

public class GlobalMembers
{
	public static int len;
	public static String a = new String(new char[200]);
	public static char b;
	public static char g;
	public static int match(int p)
	{
		if (p == len - 1)
		{
			return p;
		}
		int q;
		if (a.charAt(p) == b)
		{
			q = match(p + 1);
			System.out.print(p);
			System.out.print(" ");
			System.out.print(q);
			System.out.print("\n");
			return match(q + 1);
		}
		else
		{
			return p;
		}
	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		b = a.charAt(0);
		g = a.charAt(len - 1);
		match(0);
	}
}

