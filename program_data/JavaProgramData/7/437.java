package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		String d = new String(new char[520]);
		int i;
		int m;
		int a1;
		int b1;
		int c1;
		String k;
		int j;

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();

		a1 = a.length();
		b1 = b.length();
		c1 = c.length();
		k = tangible.StringFunctions.strStr(a,b);

		if (k == null)
		{
			System.out.printf("%s",a);
		}
		else
		{
		m = k - a.charAt(0);
		for (i = 0;i < m;i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, a.charAt(i));
		}
		for (i = 0;i < c1;i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, m + i, c.charAt(i));
		}
		j = m + c1;
		for (i = 0;m + b1 + i <= a1;i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, j + i, a.charAt(m + b1 + i));
		}
		System.out.printf("%s",d);
		}
		return 0;
	}

}

