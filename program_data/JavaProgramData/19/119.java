package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		final String s = "";
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int x = 0;
		int k = 0;
		int q;
		int l = 0;
		int d;
		int p;
		int m;
		int dd;
		int sl;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		sl = s.length();
		l = a.length();
		d = a.length() - b.length();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			x = 0;
			for (k = 0;a.charAt(k) != '\0';k++)
			{
				if (s.charAt(i + x) == a.charAt(k))
				{
					 x++;
				}
				else
				{
					break;
				}
			}
			if (l == x && (s.charAt(i - 1) == ' ' || i == 0) && (s.charAt(i + x) == ' ' || s.charAt(i + x) == '\0'))
			{

				if (d >= 0)
				{
					for (q = i + x;s.charAt(q) != '\0';q++)
					{
						s = tangible.StringFunctions.changeCharacter(s, q - d, s.charAt(q));
					}
					for (m = 0;m < d;m++)
					{
						s = tangible.StringFunctions.changeCharacter(s, q - d + m, '\0');
					}
				}
				else if (d < 0)
				{
					dd = -d;
					for (q = sl - 1;q >= i + x;q--) /*?????????s[q]!='\0'???
						                            ???????'\0'???       */
					{
						s = tangible.StringFunctions.changeCharacter(s, q + dd, s.charAt(q));
					}
					sl = sl + dd;
				}
				p = i;
				for (j = 0;b.charAt(j) != '\0';j++)
				{
					s = tangible.StringFunctions.changeCharacter(s, p, b.charAt(j));
					p++;
				}
			}

		}
		System.out.println(s);
	}
}

