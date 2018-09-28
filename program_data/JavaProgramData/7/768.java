package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String c = new String(new char[256]);
		String l = new String(new char[256]);
		String g = new String(new char[20]);
		String h = new String(new char[20]);
		int b;
		int i;
		int e = 0;
		int q;
		int p;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		b = a.length();
		h = new Scanner(System.in).nextLine();
		g = new Scanner(System.in).nextLine();
		q = h.length();
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) == h.charAt(0))
			{
				p = 1;
				for (j = 1;j < q;j++)
				{
					if (a.charAt(i + j) != h.charAt(j))
					{
						p = 0;
						break;
					}
				}
				if (p == 1)
				{
					for (k = 0;k < i;k++)
					{
						c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(k));
						c = tangible.StringFunctions.changeCharacter(c, k + 1, '\0');
					}
					l = tangible.StringFunctions.changeCharacter(l, 0, -1);
					for (k = i + q;k < b;k++)
					{
						l = tangible.StringFunctions.changeCharacter(l, k - i - q, a.charAt(k));
						l = tangible.StringFunctions.changeCharacter(l, k - i - q + 1, '\0');
					}
					c += g;
					if (l.charAt(0) != -1)
					{
						c += l;
					}
					a = c;
					b = a.length();
					break;
				}
			}
		}
		System.out.printf("%s",a);
		return 0;
	}
}

