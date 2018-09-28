package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int m;
		int i;
		int x = 0;
		int w;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			n = a.charAt(0) - 48;
			b = tangible.StringFunctions.changeCharacter(b, 0, 48);
			m = a.length();

			for (i = 1;i < m;i++)
			{
				n = n * 10 + ((int)a.charAt(i) - 48);
				if (n < 13)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, 48);
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, i, n / 13 + 48);
					n = n % 13;
				}
			}
			b = b.substring(0, m + 1);
			w = b.length();
			if (w <= 2)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(n);
				System.out.print("\n");
			}
			else if (w <= 3 && (int)a.charAt(0) - 49 == 0 && (int)a.charAt(1) - 50 <= 0)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(n);
				System.out.print("\n");
			}
			else
			{
			if (b.charAt(0) - 48 == 0)
			{
				x = 1;
			}
			if (b.charAt(1) - 48 == 0)
			{
				x = 2;
			}
			for (i = x;i < m;i++)
			{
				System.out.print(b.charAt(i));
			}
			System.out.print("\n");
			System.out.print(n);
			System.out.print("\n");
			}
		}
		return 0;
	}

}

