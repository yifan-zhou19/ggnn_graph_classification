package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double p;
		int i;
		int cnt;
		String s1 = new String(new char[505]);
		String s2 = new String(new char[505]);
		p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (s1.length() != s2.length())
		{
			System.out.println("error");
			return 0;
		}
		for (i = cnt = 0;s1.charAt(i);i++)
		{
			if (s1.charAt(i) != 'A' && s1.charAt(i) != 'T' && s1.charAt(i) != 'G' && s1.charAt(i) != 'C')
			{
				System.out.println("error");
				return 0;
			}
			if (s2.charAt(i) != 'A' && s2.charAt(i) != 'T' && s2.charAt(i) != 'G' && s2.charAt(i) != 'C')
			{
				System.out.println("error");
				return 0;
			}
			if (s1.charAt(i) == s2.charAt(i))
			{
				cnt++;
			}
		}
		if (cnt * 1.0 / i > p)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}

