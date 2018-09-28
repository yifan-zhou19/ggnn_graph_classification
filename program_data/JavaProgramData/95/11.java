package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[81]);
		String s2 = new String(new char[81]);
		s1 = tangible.StringFunctions.changeCharacter(s1, 0, new Scanner(System.in).nextLine());
		s2 = tangible.StringFunctions.changeCharacter(s2, 0, new Scanner(System.in).nextLine());
		int i = 0;
		for (i = 0 ; s1.charAt(i) != '\0' ; i++)
		{
			if (s1.charAt(i) <= 90)
			{
				s1.charAt(i) += 32;
			}
		}
		for (i = 0 ; s2.charAt(i) != '\0' ; i++)
		{
			if (s2.charAt(i) <= 90)
			{
				s2.charAt(i) += 32;
			}
		}
		int max;
		max = i;
		int n = 0;
		for (i = 0 ; i < max ; i++)
		{
			if (s1.charAt(i) < s2.charAt(i))
			{
				System.out.print("<\n");
				n++;
				break;
			}
			if (s1.charAt(i) > s2.charAt(i))
			{
				System.out.print(">\n");
				n++;
				break;
			}
		}
		if (n == 0)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}

