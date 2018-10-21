package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int la;
		int lb;
		int s;
		int i;
		int t;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		if (la < lb)
		{
			for (i = 0;i < la;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
			s = la;
			la = lb;
			lb = s;
			a = b;
			b = c;
		}
		for (i = 0;i < lb;i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}

		}
		for (i = 0;i < lb;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				t++;
			}
			if (t == lb)
			{
				System.out.print("=");
			}
		}

	}

}

