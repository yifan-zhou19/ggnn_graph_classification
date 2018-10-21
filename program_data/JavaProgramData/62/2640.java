package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		int i;
		int n;
		s = new Scanner(System.in).nextLine();
		i = 0;
		n = s.length();
		for (i = 0;i < n;i++)
		{
		if (s.charAt(i) != ' ')
		{
			System.out.printf("%c",s.charAt(i));
		}
		if (s.charAt(i) == ' ')
		{
			if (i != n - 1 && s.charAt(i + 1) != ' ')
			{
				System.out.printf("%c",s.charAt(i));
			}
			if (i != n - 1 && s.charAt(i + 1) == ' ')
			{
				continue;
			}
		}
		}
		return 0;
	}
}
