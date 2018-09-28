package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[300]);
	public static String subs = new String(new char[300]);
	public static String rep = new String(new char[300]);

	public static int ok(int wh)
	{
		int i;
		for (i = wh; i <= wh + subs.length() - 1; i++)
		{
			if (s.charAt(i) != subs.charAt(i - wh))
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int start;
		s = new Scanner(System.in).nextLine();
		subs = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		start = -1;
		for (i = 0; i <= s.length() - subs.length(); i++)
		{
			if (ok(i) != 0)
			{
				start = i;
				break;
			}
		}
		if (start == -1)
		{
			System.out.println(s);
			return 0;
		}
		for (i = 0; i < start; i++)
		{
			System.out.printf("%c", s.charAt(i));
		}
		for (i = 0; rep.charAt(i) != '\0'; i++)
		{
			System.out.printf("%c", rep.charAt(i));
		}
		for (i = start + subs.length(); s.charAt(i) != '\0'; i++)
		{
			System.out.printf("%c", s.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}
