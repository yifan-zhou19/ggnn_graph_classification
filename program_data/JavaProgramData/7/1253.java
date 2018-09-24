package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[256]);
	public static String sub = new String(new char[256]);
	public static int f(int x)
	{
		int i = x;
		int j = 0;
		while (sub.charAt(j) != '\0')
		{
			if (str.charAt(i) != sub.charAt(j))
			{
				return 0;
			}
			i++;
			j++;
		}
		return 1;
	}
	public static int Main()
	{
		String rep = new String(new char[256]);
		int i = 0;
		int j = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (str.charAt(i) != '\0')
		{
			if (f(i) != 0)
			{
				while (rep.charAt(j) != '\0')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
					i++;
					j++;
				}
				break;
			}
			i++;
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}

