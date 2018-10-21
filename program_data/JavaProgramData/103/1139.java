package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1001]);
		char c;
		int i;
		int n = 1;
		s = new Scanner(System.in).nextLine();
		if (s.charAt(0) > 'Z')
		{
			s.charAt(0) -= 'a'-'A';
		}
		c = s.charAt(0);
		for (i = 1;s.charAt(i);i++)
		{
			if (s.charAt(i) > 'Z')
			{
				s.charAt(i) -= 'a'-'A';
			}
			if (s.charAt(i) == c)
			{
				n++;
			}
			else
			{
				System.out.printf("(%c,%d)",c,n);
				c = s.charAt(i);
				n = 1;
			}
		}
		System.out.printf("(%c,%d)",c,n);
	}
}
