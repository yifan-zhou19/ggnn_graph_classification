package <missing>;

public class GlobalMembers
{
	public static String[] key = {"er", "ly", "ing"};

	public static int Main()
	{
		int n;
		int l;
		String p;
		String c = new String(new char[50]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (n -- != 0)
		{
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);

			l = c.length();

			p = c.Substring(l) - 2;

			if (strcmp(p, key[0]) == 0 || strcmp(p, key[1]) == 0)
			{
				p = null;
			}
			else
			{
				*(p - 1) = 0;
			}

			System.out.print(c);
			System.out.print("\n");
		}

	}
}

