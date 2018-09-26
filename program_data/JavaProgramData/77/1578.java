package <missing>;

public class GlobalMembers
{
	public static String m = new String(new char[100]);
	public static char boy;
	public static char girl;
	public static int len;
	public static void C()
	{
		int i;
		int g;
		for (i = 0;i < len;i++)
		{
			if (m.charAt(i) == boy)
			{
				g = findgirl(i);
				if (g != 0)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(g);
					System.out.print("\n");
					m = tangible.StringFunctions.changeCharacter(m, i, '`');
					m = tangible.StringFunctions.changeCharacter(m, g, '`');
					break;
				}
			}
		}
	}
	public static int findgirl(int i)
	{
		int a;
		if (m.charAt(i + 1) == '`')
		{
			a = findgirl(i + 1);
			return a;
		}
		else if (m.charAt(i + 1) == girl)
		{
			return i + 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i = 0;
		m = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = m.charAt(0);
		while (m.charAt(i) != '\0')
		{
			if (m.charAt(i) != boy)
			{
				girl = m.charAt(i);
				break;
			}
			else
			{
				i++;
			}
		}
		len = m.length();
		for (i = 0;i < len / 2;i++)
		{
			C();
		}
		return 0;
	}
}

