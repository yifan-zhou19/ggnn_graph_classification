package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		if (s1.length() >= s2.length())
		{
			l = s1.length();
		}
		else
		{
			l = s2.length();
		}
		for (i = 0;i <= l;i++)
		{
			if (s1.charAt(i) >= 97 && s1.charAt(i) <= 122)
			{
				s1.charAt(i) -= 32;
			}
			if (s2.charAt(i) >= 97 && s2.charAt(i) <= 122)
			{
				s2.charAt(i) -= 32;
			}
			if (s1.charAt(i) > s2.charAt(i))
			{
				System.out.println(">");
				return 0;
			}
			else if (s1.charAt(i) < s2.charAt(i))
			{
				System.out.println("<");
				return 0;
			}
		}
		System.out.println("=");
		return 0;
	}
}
