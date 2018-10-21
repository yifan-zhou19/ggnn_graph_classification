package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int i;
		int p;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			p = 1;
			if (s.charAt(i) != s.charAt(i + 1))
			{
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				{
					s.charAt(i) -= 'a'-'A';
				}
				System.out.print("(");
				System.out.print(s.charAt(i));
				System.out.print(",");
				System.out.print(1);
				System.out.print(")");
			}
			else
			{
				while (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 1) + 'A'-'a' || s.charAt(i) == s.charAt(i + 1) + 'a'-'A')
				{
					i++;
					p++;
				}
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				{
					s.charAt(i) -= 'a'-'A';
				}
				System.out.print("(");
				System.out.print(s.charAt(i));
				System.out.print(",");
				System.out.print(p);
				System.out.print(")");
			}
		}
		System.out.print("\n");
		return 0;
	}
}
