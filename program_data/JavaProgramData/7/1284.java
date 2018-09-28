package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int s;
		String str = new String(new char[256]);
		String c = new String(new char[256]);
		String d = new String(new char[256]);
		c = new Scanner(System.in).nextLine();
		str = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		m = str.length();
		n = c.length();
		for (i = 0;i < n - m + 1;i++)
		{
			if (c.charAt(i) == str.charAt(0))
			{
				s = 0;
				for (j = i;j < i + m;j++)
				{
					if (c.charAt(j) == str.charAt(j - i))
					{
						s = s + 1;
					}
				}
				if (s == m)
				{
					break;
				}
			}
		}
		if (s == m)
		{
			for (j = i;j < i + m;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, d.charAt(j - i));
			}
		}
		System.out.println(c);
		return 0;
	}

}

