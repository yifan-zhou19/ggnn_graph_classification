package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int c;
		int d;
		int e;
		int n = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = a.length();
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) < 97)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		d = b.length();
		for (i = 0;i < d;i++)
		{
			if (b.charAt(i) < 97)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		if (c == d)
		{
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
			else
			{
				n = n + 1;
			}
		}
		if (n == c)
		{
			System.out.print("=");
		}
		}
		if (c != d)
		{
			if (c > d)
			{
				e = c;
			}
			if (c < d)
			{
				e = d;
			}
		for (i = 0;i < e;i++)
		{
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
		}
		}
	}

}

