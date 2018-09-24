package <missing>;

public class GlobalMembers
{
	public static void f(int j, int i, String c)
	{
		int m;
		int n;
		for (m = 0;m <= i - j;m++)
		{
			g(c, m, j);
		}
	}
	public static void g(String c, int m, int j)
	{
		int p;
		int q;
		int i;
		p = m;
		q = m + j - 1;
		for (;;p++,q--)
		{
			if (!c[p].equals(c[q]))
			{
				break;
			}
			else if ((p == q) || (p == q - 1))
			{
				for (i = m;i <= m + j - 1;i++)
				{
					System.out.printf("%c",c[i]);
				}
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		String c = new String(new char[501]);
		int i = 0;
		int j;
		int k;
		int m;
		int n;
		int y = 0;
		int l;
		c = tangible.StringFunctions.changeCharacter(c, 0, System.in.read());
		while (c.charAt(i) != '\n')
		{
			i++;
			c = tangible.StringFunctions.changeCharacter(c, i, System.in.read());
		}
		for (j = 2;j < i;j++)
		{
			f(j, i, c);
		}

	}
}

