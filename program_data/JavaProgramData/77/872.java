package <missing>;

public class GlobalMembers
{
	public static String m = new String(new char[100]);
	public static int num = 0;
	public static int q = 0;

	public static void search(int a, int b, char boy, char girl)
	{
		if (num == (b + 1) / 2)
		{
			return;
		}
		int i;
		int t;
		for (i = a; i < b; i++)
		{
			if (m.charAt(i) == boy)
			{
				for (t = i + 1; t < b; t++)
				{
					if (m.charAt(t) != '.')
					{
						break;
					}
				}
				if (m.charAt(t) == girl)
				{
					num++;
					m = tangible.StringFunctions.changeCharacter(m, i, '.');
					m = tangible.StringFunctions.changeCharacter(m, t, '.');
					break;
				}
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(t);
		System.out.print("\n");
		search(a, b, boy, girl);
	}

	public static int Main()
	{
		char boy;
		char girl;
		int len;
		m = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = m.length();
		boy = m.charAt(0);
		girl = m.charAt(len - 1);
		search(0, len - 1, boy, girl);
		return 0;
	}
}

