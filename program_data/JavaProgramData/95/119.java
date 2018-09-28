package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[80]);
		String p = new String(new char[80]);
		int length;
		int i;
		int t;
		s = new Scanner(System.in).nextLine();
		p = new Scanner(System.in).nextLine();
		length = s.length();
		for (i = 0;i < length;i++)
		{
			if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
			{
			s.charAt(i) -= 32;
			}
		}
		length = p.length();
		 for (i = 0;i < length;i++)
		 {
			if (p.charAt(i) <= 'z' && p.charAt(i) >= 'a')
			{
			p.charAt(i) -= 32;
			}
		 }
		 t = strcmp(s,p);
		if (t == 1)
		{
			System.out.print(">\n");
		}
		if (t == -1)
		{
			System.out.print("<\n");
		}
		if (t == 0)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}
