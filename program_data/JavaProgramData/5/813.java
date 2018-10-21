package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		int num = 0;
		int pan = 1;
		char s;
		String s1 = new String(new char[600]);
		String a1 = new String(new char[600]);
		&s = new Scanner(System.in).nextLine();
		n = Double.parseDouble(s);
		s1 = new Scanner(System.in).nextLine();
		a1 = new Scanner(System.in).nextLine();
		for (int i = 0;i < s1.length();i++)
		{
			if (s1.charAt(i) != 'A' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G' && s1.charAt(i) != 'T')
			{
					pan = 0;
			}
		}
		for (int i = 0;i < a1.length();i++)
		{
			if (a1.charAt(i) != 'A' && a1.charAt(i) != 'C' && a1.charAt(i) != 'G' && a1.charAt(i) != 'T')
			{
				pan = 0;
			}
		}
		if (s1.length() != a1.length())
		{
			pan = 0;
		}
		else if (s1.length() == a1.length() && pan != 0)
		{
			for (int i = 0;i < s1.length();i++)
			{
				if (a1.charAt(i) == s1.charAt(i))
				{
					num++;
				}
			}
			if (1.0 * num / s1.length() < n)
			{
				System.out.print("no");
			}
			else
			{
				System.out.print("yes");
			}
		}
		if (pan == 0)
		{
			System.out.print("error");
		}
			return 0;
	}
}
