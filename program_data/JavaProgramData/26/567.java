package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int len;
		int i;
		int u;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = len - 1;i > 0;i--)
		{
			if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')
			{
				for (u = i;u <= len;u++)
				{
					str = tangible.StringFunctions.changeCharacter(str, u, str.charAt(u + 1));
				}
			}
		}
		System.out.println(str);
		return 0;
	}
}

