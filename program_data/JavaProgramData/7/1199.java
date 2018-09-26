package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int L;
		int l;
		int x;
		int y;
		L = a.length();
		l = b.length();
		for (x = 0;x <= L - l;x++)
		{
			if (a.charAt(x) != b.charAt(0))
			{
				continue;
			}
			else
			{
				for (y = 0;y < l;y++)
				{
					if (a.charAt(x + y) != b.charAt(y))
					{
						break;
					}
				}
				if (y != l)
				{
					continue;
				}
				else
				{
					break;
				}
			}
		}
		if (x == L - l + 1)
		{
			System.out.print(a);
			System.out.print("\n");
		}
		else
		{
			int i = 0;
			while (i != x)
			{
				System.out.print(a.charAt(i));
				i++;
			}
			System.out.print(c);
			System.out.print(a.Substring(i) + l);
			System.out.print("\n");
		}
		return 0;
	}
}

