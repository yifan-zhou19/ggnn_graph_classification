package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String p;
		String p1 = str;
		int m;
		int i;
		str = new Scanner(System.in).nextLine();
		m = str.length() - 1;
		for (i = 0;i < str.length() - 1;i++)
		{
		  p = str.charAt(i);
		  System.out.printf("%c", p + *(p.Substring(1)));
		}
		p = str.charAt(m);
		System.out.printf("%c", p + p1);
		return 0;
	}
}
