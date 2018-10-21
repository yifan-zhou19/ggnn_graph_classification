package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[305]);
		String b = new String(new char[305]);
		String c = new String(new char[305]);
		char l;
		int i;
		int j;
		int m = 0;
		int n = 0;
		int p = 1;
		int q = 1;
		int[] d = new int[305];
		int[] e = new int[305];
		int o;
		int h = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(i));
				for (j = i + 1;j < a.length();j++)
				{
					if (a.charAt(j) == a.charAt(i))
					{
						p++;
						a = tangible.StringFunctions.changeCharacter(a, j, '&');
					}
				}
				d[m] = p;
				p = 1;
				m++;
				h++;
			}
			else if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				c = tangible.StringFunctions.changeCharacter(c, n, a.charAt(i));
				for (j = i + 1;j < a.length();j++)
				{
					if (a.charAt(j) == a.charAt(i))
					{
						q++;
						a = tangible.StringFunctions.changeCharacter(a, j, '&');
					}
				}
				e[n] = q;
				q = 1;
				n++;
				h++;
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (b.charAt(j) > b.charAt(j + 1))
				{
					l = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, l);
					o = d[j];
					d[j] = d[j + 1];
					d[j + 1] = o;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (c.charAt(j) > c.charAt(j + 1))
				{
					l = c.charAt(j);
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
					c = tangible.StringFunctions.changeCharacter(c, j + 1, l);
					o = e[j];
					e[j] = e[j + 1];
					e[j + 1] = o;
				}
			}
		}

		if (h != 0)
		{

		for (i = 0;i < m;i++)
		{
			if (i == 0)
			{
				System.out.printf("%c=%d\n",b.charAt(0),d[0]);
			}
			else
			{
			System.out.printf("%c=%d\n",b.charAt(i),d[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c=%d\n",c.charAt(i),e[i]);
		}
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

