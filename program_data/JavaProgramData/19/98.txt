package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a1;
		int s1;
		int p;
		int d1;
		int e1;
		int b1;
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String e = new String(new char[100]);
		String f = new String(new char[100]);
		String g = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		a1 = a.length();
		s1 = s.length();
		b1 = b.length();
		for (i = 0;i < s1;i++)
		{

			for (p = 0;p < a1;p++)
			{
				c = tangible.StringFunctions.changeCharacter(c, p, s.charAt(i + p));
			}
			c = c.substring(0, a1);

			if (strcmp(c,a) == 0)
			{
				if ((i == 0 && s.charAt(a1) == 32) || (s.charAt(i - 1) == 32 && s.charAt(a1 + i) == 32))
				{
					for (d1 = 0;d1 < (s1 - i - a1);d1++)
					{
					d = tangible.StringFunctions.changeCharacter(d, d1, s.charAt(d1 + a1 + i));
					}
				d = d.substring(0, s1 - i - a1);
				for (e1 = 0;e1 < i;e1++)
				{
					e = tangible.StringFunctions.changeCharacter(e, e1, s.charAt(e1));
				}
				e = e.substring(0, i);
				e += b;
				e += d;
				s = e;
				s1 = s.length();
				i = i + b1 - a1;
				}
			}
		}
		System.out.printf("%s",s);

		return 0;
	}
}

