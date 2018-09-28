package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		int[] c = new int[260];
		int i;
		int la;
		int lb;
		int t = 0;
		int s = 0;
		int num = char c;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		for (i = 259;i >= 259 - la;i--)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(la + i - 259));
		}
		for (i = 259;i >= 259 - lb;i--)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(lb + i - 259));
		}
		for (i = 0;i < 259 - la;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		for (i = 0;i < 259 - lb;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = 258;i >= 0;i--)
		{
			if (num(a.charAt(i)) + num(b.charAt(i)) + t >= 10)
			{
				c[i] = num(a.charAt(i)) + num(b.charAt(i)) + t - 10;
				t = 1;
			}
			else
			{
				c[i] = num(a.charAt(i)) + num(b.charAt(i)) + t;
				t = 0;
			}
		}
		for (i = 0;i <= 258;i++)
		{
			if (c[i] != 0)
			{
				s = 1;
			}
			if (s == 1)
			{
				System.out.printf("%d",c[i]);
			}
		}
		if (s == 0)
		{
			System.out.printf("%d",s);
		}
		System.out.print("\n");
		return 0;
	}

	public static int num(char c)
	{
		int n;
		n = c - '0';
		return n;
	}
}

