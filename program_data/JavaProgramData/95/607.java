package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		int i;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) % 32 == s2.charAt(i) % 32 && s1.charAt(i) != '\0' && s2.charAt(i) != '\0';i++)
		{
		if (s1.charAt(i) > 96)
		{
			s1.charAt(i) -= 32;
		}
		}

		if (s2.charAt(i) > 96)
		{
			s2.charAt(i) -= 32;
		}
		if (s1.charAt(i) < s2.charAt(i))
		{
			System.out.print("<\n");
		}
		if (s1.charAt(i) > s2.charAt(i))
		{
			System.out.print(">\n");
		}
		if (s1.charAt(i) == s2.charAt(i))
		{
			System.out.print("=\n");
		}
	}
}
