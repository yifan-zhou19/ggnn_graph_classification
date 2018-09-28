package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		int i;
		int c;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) != '\0' && s2.charAt(i) != '\0';i++)
		{
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			{
				s1.charAt(i) += 32;
			}
			if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z')
			{
				s2.charAt(i) += 32;
			}
		}
		c = strcmp(s1,s2);
		if (c == 0)
		{
			System.out.print("=");
		}
		else if (c > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}
}
