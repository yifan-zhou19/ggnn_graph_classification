package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int i;
		int j = 0;
		int k = 0;
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String p;
		String q;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		p = s;
		q = a;
		for (i = l - 1;i >= 0;i--)
		{
			if (s.charAt(i) == ' ')
			{
				s = s.substring(0, i);
			}
		}
		for (i = l - 1;i >= 0;i--)
		{
			if (s.charAt(i) == 0)
			{
				q.Substring(j) = p.Substring(i) + 1;
				j = l - i;
			}
			if (i == 0)
			{
				q.Substring(j) = p;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
		}
		System.out.printf("%s\n",a);
	}

}

