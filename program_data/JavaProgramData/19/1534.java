package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[101]);
	public static String target = new String(new char[10001]);
	public static String a = new String(new char[101]);
	public static String b = new String(new char[101]);
	public static String c = new String(new char[101]);
	public static int i = 0;
	public static int j = 0;
	public static int k = 0;
	public static int len_str;
	public static int len_a;
	public static int len_b;
	public static int pos = 0;
	public static int t = 0;
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		len_str = str.length();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len_a = a.length();
		len_b = b.length();
		while (i < len_str)
		{
			pos = 0;
			while (str.charAt(i) != ' ' && i < len_str)
			{
				c = tangible.StringFunctions.changeCharacter(c, pos++, str.charAt(i++));
			}
			c = tangible.StringFunctions.changeCharacter(c, pos, '\0');
			if (strcmp(a, c) == 0)
			{
				System.out.printf("%s", b);
			}
			else
			{
				System.out.printf("%s", c);
			}
			if (i == len_str)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(" ");
			}
			i++;
		}
		return 0;
	}

}

