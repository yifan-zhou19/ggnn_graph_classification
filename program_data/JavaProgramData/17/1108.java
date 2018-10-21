package <missing>;

public class GlobalMembers
{
	public static int len;
	public static String str = new String(new char[101]);
	public static void f(int p)
	{
		int m = -1;
		int n = -1;
		for (int i = p; i >= 0; i--)
		{
			if (*(str.Substring(i)) == '(')
			{
				m = i;
				break;
			}
		}
		for (int i = m + 1; i <= len - 1; i++)
		{
			if (*(str.Substring(i)) == ')')
			{
				n = i;
				break;
			}
		}
		if (m >= 0 && n >= 0)
		{
		str = tangible.StringFunctions.changeCharacter(str, m, '#');
		str = tangible.StringFunctions.changeCharacter(str, n, '#');
		}
		if (m > 0)
		{
			f(m - 1);
		}
	}

	public static int Main()
	{
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		len = str.length();
		System.out.print(str);
		System.out.print("\n");
		f(len);
		for (int j = 0;j <= len - 1; j++)
		{
			if (str.charAt(j) == '(')
			{
				System.out.print("$");
			}
			else if (str.charAt(j) == ')')
			{
				System.out.print("?");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		}
		return 0;
	}

}

