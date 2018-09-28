package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String cc = "";
		final String c = "";
		int a;
		int b;
		int d;
		int e = 0;
		int f = 0;
		int[] g = new int[50];
		cc = new Scanner(System.in).nextLine();
		for (a = 0;a < 500;a++)
		{
			if (cc.charAt(a) == ' ' && cc.charAt(a + 1) == '\0')
			{
				cc = tangible.StringFunctions.changeCharacter(cc, a, '\0');
			}
		}
		for (a = 0;a < 500;a++)
		{
			if (cc.charAt(a) == ' ')
			{
				e++;
				f = 0;
			}
			else
			{
				c.charAt(e)[f] = cc.charAt(a);
				f++;
			}
		}
		for (b = 0;b <= e;b++)
		{
			g[b] = String.valueOf(c.charAt(b)).length();
		}
		for (a = 0;a <= e;a++)
		{
			f = 0;
			for (b = 0;b <= e;b++)
			{
				if (g[a] >= g[b])
				{
					f++;
				}

			}
			if (f > e)
			{
				System.out.printf("%s\n",c.charAt(a));
				break;
			}
		}
		for (a = 0;a <= e;a++)
		{
			f = 0;
			for (b = 0;b <= e;b++)
			{
				if (g[a] <= g[b])
				{
					f++;
				}

			}
			if (f > e)
			{
				System.out.printf("%s\n",c.charAt(a));
				break;
			}
		}
	}




}

