package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j;
		int m;
		int n;
		int k;
		int t;
		int q = 0;
		int p = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = s.length();
		n = a.length();
		k = b.length();
		for (i = 0;i <= m - n;i++)
		{
			for (j = i;j < i + n;j++)
			{
				if (s.charAt(j) == a.charAt(j - i))
				{
					p++;
				}
				else
				{
					break;
				}
			}
			if (p == n)
			{
				q++;
				t = i;
				for (j = 0;j <= t - 1;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(j));
				}
				for (j = t;j < t + k;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(j - i));
				}
				for (j = t + k;j < m - n + k;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(n + j - k));
				}
				c = tangible.StringFunctions.changeCharacter(c, m - n + k, '\0');
				System.out.println(c);
				break;
			}
			p = 0;
		}
		if (q == 0)
		{
			System.out.println(s);
		}
		return 0;
	}


}

