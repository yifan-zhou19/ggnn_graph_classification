package <missing>;

public class GlobalMembers
{
	// ??????????


	public static int Main()
	{
		int i = 0;
		String s1 = new String(new char[255]);
		String s2 = new String(new char[255]);
		char c1;
		char c2;

		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();

		for (i = 0; s1.charAt(i) && s2.charAt(i); i++)
		{
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				s1.charAt(i) -= 'a' - 'A';
			}
			if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
			{
				s2.charAt(i) -= 'a' - 'A';
			}
			if (s1.charAt(i) != s2.charAt(i))
			{
				System.out.print((s1.charAt(i) > s2.charAt(i)) ? ">" : "<");
				return 0;
			}
		}

		System.out.print("=");
		return 0;
	}
}
