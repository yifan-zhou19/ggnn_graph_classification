package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[max]);
	public static String b = new String(new char[251]);
	public static String c = new String(new char[251]);
	public static void panduan(int i)
	{
		int k;
		int l;
		if (2 * i > a.length())
		{
			return;
		}
		for (int j = 0; 2 * i + j <= a.length(); j++)
		{
			for (k = 0; k < i; k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(j + k));
			}
			b = tangible.StringFunctions.changeCharacter(b, k, '\0');
			for (l = 0; l < i; l++)
			{
				c = tangible.StringFunctions.changeCharacter(c, l, a.charAt(j + i * 2 - 1 - l));
			}
			c = tangible.StringFunctions.changeCharacter(c, l, '\0');
			if (strcmp(b, c) == 0)
			{
				System.out.print(b);
				for (int x = c.length() - 1; x >= 0; x--)
				{
					System.out.print(c.charAt(x));
				}
				System.out.print("\n");
			}

		}
		panduan(i + 1);
	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		panduan(1);

	}
}

