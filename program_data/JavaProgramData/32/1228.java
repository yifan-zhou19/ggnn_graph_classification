package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int m;
		int n;
		int i;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		while (N-- != 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			m = a.length();
			n = b.length();
			int t = 0;
			int left = 0;
			for (i = 0; i < n; i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, m - 1 - i, b.charAt(n - 1 - i));
			}
			for (i = 0; i < m - n; i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '0');
			}
			//cout << a << endl << c << endl;
			for (i = m - 1; i >= 0; i--)
			{
				if (a.charAt(i) - c.charAt(i) + left < 0)
				{
					t = -1;
				}
				else
				{
					t = 0;
				}
				a = tangible.StringFunctions.changeCharacter(a, i, (a.charAt(i) - c.charAt(i) + left + 10) % 10 + '0');
				left = t;
			}
			System.out.print(a);
			System.out.print("\n");
		}

		return 0;
	}

}

