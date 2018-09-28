package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[80]);
		String d = new String(new char[80]);
		char f = char x[80];
		int t;
		c = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		f(c);
		f(d);
		t = strcmp(c,d);
		if (t < 0)
		{
			System.out.print("<");
		}
		if (t == 0)
		{
			System.out.print("=");
		}
		if (t > 0)
		{
			System.out.print(">");
		}
		 return 0;
	}
	public static char f(String x)
	{
		int m;
		int i;
		m = x.length();
		for (i = 0;i <= m - 1;i++)
		{
		 if (x[i].compareTo('A') >= 0 && x[i].compareTo('Z') <= 0)
		 {
				x[i] = x[i].Substring(32);
		 }
		}
		 return 0;
	}
}
