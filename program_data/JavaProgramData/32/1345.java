package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= n;k++)
		{
			String a = new String(new char[101]);
			String b = new String(new char[101]);
			String c = new String(new char[101]);
			//cin.getline(a,101);
			//cin.getline(b,101);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int lena;
			int lenb;
			lena = a.length();
			lenb = b.length();
			for (int i = 1;i <= lenb;i++)
			{
				if (a.charAt(lena - i) >= b.charAt(lenb - i))
				{
					c = tangible.StringFunctions.changeCharacter(c, lena - i, a.charAt(lena - i) - b.charAt(lenb - i) + '0');
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, lena - i, a.charAt(lena - i) + 10 - b.charAt(lenb - i) + '0');
					int t;
					t = lena - i;
					while (a.charAt(t - 1) == '0')
					{
						a = tangible.StringFunctions.changeCharacter(a, t - 1, '9');
						t--;
					}
					a.charAt(t - 1) -= 1;
				}
			}
			for (int i = 0;i < lena - lenb;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
			for (int i = 0;i < lena;i++)
			{
				System.out.print(c.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

