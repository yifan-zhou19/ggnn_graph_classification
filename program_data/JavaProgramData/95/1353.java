package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int cmp;
		String s1 = new String(new char[max + 1]);
		String s2 = new String(new char[max + 1]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i);i++)
		{
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				s1.charAt(i) -= 'a'-'A';
			}
		}
		for (i = 0;s2.charAt(i);i++)
		{
			if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
			{
				s2.charAt(i) -= 'a'-'A';
			}
		}
		cmp = strcmp(s1,s2);
		if (cmp > 0)
		{
			System.out.print(">");
		}
		if (cmp == 0)
		{
			System.out.print("=");
		}
		if (cmp < 0)
		{
			System.out.print("<");
		}
		return 0;
	}
}
