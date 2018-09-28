package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		i = 0;
		while (s1.charAt(i) != '\0' && (s1.charAt(i) == s2.charAt(i) || (s1.charAt(i) <= 'Z' && s1.charAt(i) >= 'A' && s2.charAt(i) - s1.charAt(i) == 'a'-'A') || (s2.charAt(i) <= 'Z' && s2.charAt(i) >= 'A' && s1.charAt(i) - s2.charAt(i) == 'a'-'A')))
		{
			i++;
		}
		if ((s1.charAt(i) > s2.charAt(i)) || (s2.charAt(i) <= 'z' && s2.charAt(i) >= 'a' && s2.charAt(i) - s1.charAt(i) < 'a'-'A'))
		{
			System.out.print(">");
		}
		else if ((s1.charAt(i) < s2.charAt(i)) || (s1.charAt(i) <= 'z' && s1.charAt(i) >= 'a' && s1.charAt(i) - s2.charAt(i) < 'a'-'A'))
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
		return 0;

	}
}
