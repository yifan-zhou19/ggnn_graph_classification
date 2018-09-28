package <missing>;

public class GlobalMembers
{
	public static String calc(tangible.RefObject<String> ps, tangible.RefObject<String> pt)
	{
		int i;
		int m = ps.argValue.length();
		for (i = 0;i < m - 1;i++)
		{
			*(pt.argValue.Substring(i)) = *(ps.argValue.Substring(i)) + *(ps.argValue.Substring(i) + 1);
		}
		*(pt.argValue.Substring(m) - 1) = *(ps.argValue.Substring(m) - 1) + *(ps.argValue.Substring(0));
		return pt.argValue;
	}
	public static int Main()
	{
		String s = new String(new char[101]);
		final String c = "";
		s = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
	tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
		System.out.printf("%s\n",calc(tempRef_s, tempRef_c));
		c = tempRef_c.argValue;
		s = tempRef_s.argValue;
		return 0;
	}
}

