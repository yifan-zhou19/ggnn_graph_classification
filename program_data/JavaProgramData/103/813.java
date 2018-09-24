package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		char c = System.in.read();
		int num = 0;
		while (c != '\n')
		{
			if (c >= 97 && c <= 122)
			{
				a = tangible.StringFunctions.changeCharacter(a, num, c - 32);
				num++;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, num, c);
				num++;
			}
			c = System.in.read();
		}
		int i = 0;
		num = 1;
		a = tangible.StringFunctions.changeCharacter(a, a.length(), '1');
		for (i = 0;i < a.length() - 1;i++)
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				num++;
			}
			else if (a.charAt(i) != a.charAt(i + 1))
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

