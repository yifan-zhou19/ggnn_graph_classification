package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		String c = new String(new char[1000]);
		c = new Scanner(System.in).nextLine();
		l = c.length();
		int a;
		a = 0;
		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 32);
			}
		}
		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) == c.charAt(i + 1))
			{
				a++;
			}
		else
		{
			System.out.print("(");
			System.out.print(c.charAt(i));
			System.out.print(",");
			System.out.print(a + 1);
			System.out.print(")");
		a = 0;
		}
		}




				return 0;
	}

}

