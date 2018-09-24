package <missing>;

public class GlobalMembers
{
	public static int plug(String str, String substr)
	{
		int i;
		int j;
		int t;
		int c;
		int n;
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String p = new String(new char[11]);
		char q;
		n = str.length();
		p = str;
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (p.charAt(i) < p.charAt(i + 1))
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
					q = p.charAt(i);
					p = tangible.StringFunctions.changeCharacter(p, i, p.charAt(i + 1));
					p = tangible.StringFunctions.changeCharacter(p, i + 1, q);
				}
			}
		}
		c = a[0];
		for (i = 0;i <= c;i++)
		{
			System.out.printf("%c",str[i]);
		}
		System.out.printf("%s",substr);
		for (i = c + 1;i < n;i++)
		{
			System.out.printf("%c",str[i]);
		}
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			plug(str, substr);
		}
		return 0;
	}
}

