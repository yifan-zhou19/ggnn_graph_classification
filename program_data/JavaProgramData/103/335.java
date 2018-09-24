package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1001]);
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();
		int i = 0;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
			}
		}
		int num = 1;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i + 1) == a.charAt(i))
			{
				num++;
			}
			if (a.charAt(i + 1) != a.charAt(i))
			{
				System.out.print("(");
				System.out.print(a.charAt(i));
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
				num = 1;
			}
		}

		return 0;
	}
}

