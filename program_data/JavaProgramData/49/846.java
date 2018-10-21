package <missing>;

public class GlobalMembers
{
	/* ???? ????.cpp
	 * ??? 1200012826 ??
	 * ??? 2012?11?18?
	 */
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int i;
		int j;
		int k;
		int m;
		int p;
		int l;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		for (i = 1; i < l; i++)
		{
			for (j = 0; j < l - 1; j++)
			{
				p = 1;
				m = i;
				for (k = 0; k <= i; k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(j + k));
				}
				for (k = 0; k <= m; k++)
				{
					if (b.charAt(k) == b.charAt(m - k))
					{
						continue;
					}
					else
					{
						p = 0;
						break;
					}
				}
				if (p != 0)
				{
					for (k = 0; k <= m; k++)
					{
						System.out.print(b.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

