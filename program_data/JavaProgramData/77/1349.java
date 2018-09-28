package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);

	public static int match(String str, char b, char g)
	{
		int i;
		int j;
		for (i = 0; !str[i].equals('\0'); i++)
		{
			if (str[i].equals(g))
			{
				break;
			}
		}
		if (str[i].equals('\0'))
		{
			return 0;
		}
		for (j = i; j >= 0; j--)
		{
			if (str[j].equals(b))
			{
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		str[i] = '#';
		str[j] = '#';
		match(str, b, g);
	}

	public static int Main()
	{
		char b;
		char g;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = str.charAt(0);
		int i;
		int length;
		length = str.length();
		for (i = 0; i < length; i++)
		{
			if (str.charAt(i) != b)
			{
				g = str.charAt(i);
				break;
			}
		}
		match(str, b, g);
		return 0;
	}




}

